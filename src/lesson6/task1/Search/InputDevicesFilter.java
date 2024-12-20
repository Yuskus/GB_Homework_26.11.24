package lesson6.task1.Search;

import java.util.stream.Collectors;
import lesson6.task1.Objects.LaptopCollection;

public class InputDevicesFilter {
    public static void SearchingByNumPad(LaptopCollection collection, boolean IsNumPad) {
        collection.set(collection
                .get()
                .stream()
                .filter(s -> s.getInputDevices().getIsNumPad() == IsNumPad)
                .collect(Collectors.toSet()));
    }
}
