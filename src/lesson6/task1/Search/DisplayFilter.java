package lesson6.task1.Search;

import java.util.stream.Collectors;
import lesson6.task1.Objects.LaptopCollection;

public class DisplayFilter {
    public static void SearchingByDiagonal(LaptopCollection collection, Float minDiagonal, Float maxDiagonal) {
        collection.set(collection
                .get()
                .stream()
                .filter(s -> isInRange(s.getDisplay().getDiagonal(), minDiagonal, maxDiagonal))
                .collect(Collectors.toSet()));
    }

    private static boolean isInRange(float value, float min, float max) {
        return value >= min && value <= max;
    }
}
