package lesson3.task1;

import java.util.ArrayList;
import java.util.List;

class FilterNegative {
    int[] filterNegative(int[] a) {
        if (a == null || a.length == 0)
            return a;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0)
                list.add(a[i]);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
