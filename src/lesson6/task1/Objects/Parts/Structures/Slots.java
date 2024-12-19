package lesson6.task1.Objects.Parts.Structures;

import java.util.HashMap;
import java.util.Map;

public enum Slots {
    USB_2_0_TypeA(0),
    USB_3_0_TypeA(1),
    USB_3_1_TypeA(2),
    USB_3_0_TypeC(3),
    USB_3_1_TypeC(4),
    HDMI(5),
    TRS_MINI_JACK(6),
    TRRS_MINI_JACK(7),
    THUNDERBOLT_4(8);

    private final int value;
    private static Map<Integer, Slots> map = new HashMap<>();

    Slots(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    static {
        for (Slots val : Slots.values()) {
            map.put(val.value, val);
        }
    }

    public static Slots valueOf(int val) {
        return (Slots) map.get(val);
    }
}
