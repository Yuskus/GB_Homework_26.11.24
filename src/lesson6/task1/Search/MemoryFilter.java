package lesson6.task1.Search;

import lesson6.task1.Objects.Laptop;
import lesson6.task1.Objects.LaptopCollection;

public class MemoryFilter {
    public static LaptopCollection SearchingByRam(LaptopCollection collection, Integer minRAM) {
        LaptopCollection result = new LaptopCollection();
        for (Laptop lap : collection.getCopy()) {
            if (lap.getMemory().getRAM() >= minRAM)
                result.add(lap);
        }
        return result;
    }

    public static LaptopCollection SearchingByRom(LaptopCollection collection, Integer minROM) {
        LaptopCollection result = new LaptopCollection();
        for (Laptop lap : collection.getCopy()) {
            if (lap.getMemory().getROM() >= minROM)
                result.add(lap);
        }
        return result;
    }
}
