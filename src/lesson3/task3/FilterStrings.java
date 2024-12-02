package lesson3.task3;

import java.util.ArrayList;
import java.util.List;

class FilterStrings {
    String[] filterShortStrings(String[] arr) {
        if (arr == null || arr.length == 0)
            return arr;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].length() > 3)
                list.add(arr[i]);
        }
        String[] res = new String[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
