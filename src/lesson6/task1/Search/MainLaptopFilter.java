package lesson6.task1.Search;

import java.util.stream.Collectors;
import lesson6.task1.Objects.LaptopCollection;
import lesson6.task1.Objects.Parts.Structures.Brands;
import lesson6.task1.Objects.Parts.Structures.Colors;
import lesson6.task1.Objects.Parts.Structures.OperationSystem;

public class MainLaptopFilter {
    public static void SearchingByBrand(LaptopCollection collection, Brands Brand) {
        collection.set(collection
                .get()
                .stream()
                .filter(s -> s.getBrand() == Brand)
                .collect(Collectors.toSet()));
    }

    public static void SearchingByOS(LaptopCollection collection, OperationSystem OS) {
        collection.set(collection
                .get()
                .stream()
                .filter(s -> s.getOS() == OS)
                .collect(Collectors.toSet()));
    }

    public static void SearchingByColor(LaptopCollection collection, Colors color) {
        collection.set(collection
                .get()
                .stream()
                .filter(s -> s.getColor() == color)
                .collect(Collectors.toSet()));
    }
}
