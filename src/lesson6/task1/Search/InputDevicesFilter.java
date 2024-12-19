package lesson6.task1.Search;

import lesson6.task1.Objects.Laptop;
import lesson6.task1.Objects.LaptopCollection;

public class InputDevicesFilter {
    public static LaptopCollection SearchingByNumPad(LaptopCollection collection, boolean IsNumPad) {
        LaptopCollection result = new LaptopCollection();
        for (Laptop lap : collection.getCopy()) {
            if (lap.getInputDevices().getIsNumPad() == IsNumPad)
                result.add(lap);
        }
        return result;
    }
}
