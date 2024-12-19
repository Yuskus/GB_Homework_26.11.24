package lesson6.task1.Search;

import lesson6.task1.Objects.Laptop;
import lesson6.task1.Objects.LaptopCollection;

public class BatteryFilter {
    public static LaptopCollection SearchingByCharge(LaptopCollection collection, boolean IsSpeedCharge) {
        LaptopCollection result = new LaptopCollection();
        for (Laptop lap : collection.getCopy()) {
            if (lap.getBattery().getIsSpeedCharge() == IsSpeedCharge)
                result.add(lap);
        }
        return result;
    }
}
