package lesson6.task1.Search;

import java.util.stream.Collectors;
import lesson6.task1.Objects.LaptopCollection;

public class BatteryFilter {
    public static void SearchingByCharge(LaptopCollection collection, boolean IsSpeedCharge) {
        collection.set(collection
                .get()
                .stream()
                .filter(s -> s.getBattery().getIsSpeedCharge() == IsSpeedCharge)
                .collect(Collectors.toSet()));
    }
}
