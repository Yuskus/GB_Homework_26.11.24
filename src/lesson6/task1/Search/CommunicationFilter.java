package lesson6.task1.Search;

import java.util.stream.Collectors;
import lesson6.task1.Objects.LaptopCollection;

public class CommunicationFilter {
    public static void SearchingByBluetooth(LaptopCollection collection, Float minBluetoothVersion) {
        collection.set(collection
                .get()
                .stream()
                .filter(s -> s.getCommunication().getBluetoothVersion() >= minBluetoothVersion)
                .collect(Collectors.toSet()));
    }
}
