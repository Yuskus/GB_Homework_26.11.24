package lesson6.task1.Search;

import java.util.stream.Collectors;
import lesson6.task1.Objects.LaptopCollection;
import lesson6.task1.Objects.Parts.Structures.Brands;

public class ProcessorFilter {
    public static void SearchingByBrand(LaptopCollection collection, Brands Brand) {
        collection.set(collection
                .get()
                .stream()
                .filter(s -> s.getProcessor().getBrand() == Brand)
                .collect(Collectors.toSet()));
    }

    public static void SearchingByCores(LaptopCollection collection, Integer minCores) {
        collection.set(collection
                .get()
                .stream()
                .filter(s -> s.getProcessor().getAllCores() >= minCores)
                .collect(Collectors.toSet()));
    }
}
