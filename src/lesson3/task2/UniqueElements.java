package lesson3.task2;

import java.util.LinkedHashSet;

class UniqueElements {
    int[] getUniqueElements(int[] a) {
        if (a == null || a.length == 0)
            return a;
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < a.length; i++) {
            hashSet.add(a[i]);
        }
        int[] res = new int[hashSet.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = hashSet.removeFirst();
        }
        return res;
    }
}
