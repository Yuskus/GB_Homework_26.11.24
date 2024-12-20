package lesson6.task1.Objects.Parts.Structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public enum OperationSystem {
    NONE(0),
    LINUX(1),
    MAC_OS(2),
    WINDOWS7(3),
    WINDOWS8(4),
    WINDOWS10(5),
    WINDOWS11(6),
    FREE_DOS(7);

    private final int value;
    private static Map<Integer, OperationSystem> map = new HashMap<>();

    OperationSystem(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    static {
        for (OperationSystem val : OperationSystem.values()) {
            map.put(val.value, val);
        }
    }

    public static OperationSystem valueOf(int val) {
        return (OperationSystem) map.get(val);
    }

    public static void print() {
        System.out.println("OperationSystem: ");
        for (Entry<Integer, OperationSystem> item : map.entrySet()) {
            System.out.println("Key [" + item.getKey() + "] has value: " + item.getValue());
        }
    }
}
