package lesson6.task1.Search;

import lesson6.task1.Objects.Laptop;
import lesson6.task1.Objects.LaptopCollection;

public class DisplayFilter {
    public static LaptopCollection SearchingByDiagonal(LaptopCollection collection, Float minDiagonal,
            Float maxDiagonal) {
        LaptopCollection result = new LaptopCollection();
        for (Laptop lap : collection.getCopy()) {
            float diagonal = lap.getDisplay().getDiagonal();
            if (diagonal >= minDiagonal && diagonal <= maxDiagonal)
                result.add(lap);
        }
        return result;
    }
}
