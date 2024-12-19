package lesson6.task1.Search;

import lesson6.task1.Objects.Laptop;
import lesson6.task1.Objects.LaptopCollection;

public class MultimediaFilter {
    public static LaptopCollection SearchingByCam(LaptopCollection collection, Float minMP, Float maxMP) {
        LaptopCollection result = new LaptopCollection();
        for (Laptop lap : collection.getCopy()) {
            float mp = lap.getMultimedia().getWebCamMP();
            if (mp >= minMP && mp <= maxMP)
                result.add(lap);
        }
        return result;
    }
}
