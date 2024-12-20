package lesson6.task1.Objects.Parts.Structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public enum Colors {
    BLACK(0),
    BLUE(1),
    GRAY(2);

    private final int value;
    private static Map<Integer, Colors> map = new HashMap<>();

    Colors(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    static {
        for (Colors val : Colors.values()) {
            map.put(val.value, val);
        }
    }

    public static Colors valueOf(int val) {
        return (Colors) map.get(val);
    }

    public static void print() {
        System.out.println("Colors: ");
        for (Entry<Integer, Colors> item : map.entrySet()) {
            System.out.println("Key [" + item.getKey() + "] has value: " + item.getValue());
        }
    }
}
