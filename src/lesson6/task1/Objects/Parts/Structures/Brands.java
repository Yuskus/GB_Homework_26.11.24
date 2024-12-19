package lesson6.task1.Objects.Parts.Structures;

import java.util.HashMap;
import java.util.Map;

public enum Brands {
    UNKNOWN(0),
    INTEL(1),
    AMD(2),
    APPLE(3),
    MSI(4),
    HP(5),
    ACER(6),
    ASUS(7),
    HONOR(8),
    HUAWEI(9);

    private final int value;
    private static Map<Integer, Brands> map = new HashMap<>();

    Brands(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    static {
        for (Brands val : Brands.values()) {
            map.put(val.value, val);
        }
    }

    public static Brands valueOf(int val) {
        return (Brands) map.get(val);
    }
}
