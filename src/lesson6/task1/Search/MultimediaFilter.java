package lesson6.task1.Search;

import java.util.stream.Collectors;
import lesson6.task1.Objects.LaptopCollection;

public class MultimediaFilter {
    public static void SearchingByCam(LaptopCollection collection, Float minMP, Float maxMP) {
        collection.set(collection
                .get()
                .stream()
                .filter(s -> isInRange(s.getMultimedia().getWebCamMP(), minMP, maxMP))
                .collect(Collectors.toSet()));
    }

    private static boolean isInRange(float value, float min, float max) {
        return value >= min && value <= max;
    }
}
