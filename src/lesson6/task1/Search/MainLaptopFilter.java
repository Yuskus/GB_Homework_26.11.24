package lesson6.task1.Search;

import lesson6.task1.Objects.Laptop;
import lesson6.task1.Objects.LaptopCollection;
import lesson6.task1.Objects.Parts.Structures.Brands;
import lesson6.task1.Objects.Parts.Structures.Colors;
import lesson6.task1.Objects.Parts.Structures.OperationSystem;

public class MainLaptopFilter {
    public static LaptopCollection SearchingByBrand(LaptopCollection collection, Brands Brand) {
        LaptopCollection result = new LaptopCollection();
        for (Laptop lap : collection.getCopy()) {
            if (lap.getBrand() == Brand)
                result.add(lap);
        }
        return result;
    }

    public static LaptopCollection SearchingByOS(LaptopCollection collection, OperationSystem OS) {
        LaptopCollection result = new LaptopCollection();
        for (Laptop lap : collection.getCopy()) {
            if (lap.getOS() == OS)
                result.add(lap);
        }
        return result;
    }

    public static LaptopCollection SearchingByColor(LaptopCollection collection, Colors color) {
        LaptopCollection result = new LaptopCollection();
        for (Laptop lap : collection.getCopy()) {
            if (lap.getColor() == color)
                result.add(lap);
        }
        return result;
    }
}
