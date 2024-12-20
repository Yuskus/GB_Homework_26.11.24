package lesson6.task1.Objects.Parts.Structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public enum KeyboardLanguages {
    EN(0),
    EN_RU(1);

    private final int value;
    private static Map<Integer, KeyboardLanguages> map = new HashMap<>();

    KeyboardLanguages(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    static {
        for (KeyboardLanguages val : KeyboardLanguages.values()) {
            map.put(val.value, val);
        }
    }

    public static KeyboardLanguages valueOf(int val) {
        return (KeyboardLanguages) map.get(val);
    }

    public static void print() {
        System.out.println("KeyboardLanguages: ");
        for (Entry<Integer, KeyboardLanguages> item : map.entrySet()) {
            System.out.println("Key [" + item.getKey() + "] has value: " + item.getValue());
        }
    }
}
