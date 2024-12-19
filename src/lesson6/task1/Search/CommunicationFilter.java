package lesson6.task1.Search;

import lesson6.task1.Objects.Laptop;
import lesson6.task1.Objects.LaptopCollection;

public class CommunicationFilter {
    public static LaptopCollection SearchingByBluetooth(LaptopCollection collection, Float minBluetoothVersion) {
        LaptopCollection result = new LaptopCollection();
        for (Laptop lap : collection.getCopy()) {
            if (lap.getCommunication().getBluetoothVersion() >= minBluetoothVersion)
                result.add(lap);
        }
        return result;
    }
}
