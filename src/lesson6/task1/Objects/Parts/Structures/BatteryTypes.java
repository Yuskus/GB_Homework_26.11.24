package lesson6.task1.Objects.Parts.Structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public enum BatteryTypes {
    UNKNOWN(0),
    LI_ION(1),
    LI_POL(2);

    private final int value;
    private static Map<Integer, BatteryTypes> map = new HashMap<>();

    BatteryTypes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    static {
        for (BatteryTypes val : BatteryTypes.values()) {
            map.put(val.value, val);
        }
    }

    public static BatteryTypes valueOf(int val) {
        return (BatteryTypes) map.get(val);
    }

    public static void print() {
        System.out.println("BatteryTypes: ");
        for (Entry<Integer, BatteryTypes> item : map.entrySet()) {
            System.out.println("Key [" + item.getKey() + "] has value: " + item.getValue());
        }
    }
}
