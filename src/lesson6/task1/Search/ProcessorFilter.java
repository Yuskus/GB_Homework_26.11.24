package lesson6.task1.Search;

import lesson6.task1.Objects.Laptop;
import lesson6.task1.Objects.LaptopCollection;
import lesson6.task1.Objects.Parts.Structures.Brands;

public class ProcessorFilter {
    public static LaptopCollection SearchingByBrand(LaptopCollection collection, Brands Brand) {
        LaptopCollection result = new LaptopCollection();
        for (Laptop lap : collection.getCopy()) {
            if (lap.getProcessor().getBrand() == Brand)
                result.add(lap);
        }
        return result;
    }

    public static LaptopCollection SearchingByCores(LaptopCollection collection, Integer minCores) {
        LaptopCollection result = new LaptopCollection();
        for (Laptop lap : collection.getCopy()) {
            if (lap.getProcessor().getAllCores() >= minCores)
                result.add(lap);
        }
        return result;
    }
}
