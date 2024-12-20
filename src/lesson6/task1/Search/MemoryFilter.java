package lesson6.task1.Search;

import java.util.stream.Collectors;
import lesson6.task1.Objects.LaptopCollection;

public class MemoryFilter {
    public static void SearchingByRam(LaptopCollection collection, Integer minRAM) {
        collection.set(collection
                .get()
                .stream()
                .filter(s -> s.getMemory().getRAM() >= minRAM)
                .collect(Collectors.toSet()));
    }

    public static void SearchingByRom(LaptopCollection collection, Integer minROM) {
        collection.set(collection
                .get()
                .stream()
                .filter(s -> s.getMemory().getROM() >= minROM)
                .collect(Collectors.toSet()));
    }
}
