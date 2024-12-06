package lesson4.task3;

import java.util.LinkedList;

class ListUtils {
    static int countOccurrences(LinkedList<String> list, String value) {
        if (list == null || value == null)
            return 0;
        if (list.size() == 0 || value.length() == 0)
            return 0;
        int res = 0;
        for (String val : list) {
            if (val.equalsIgnoreCase(value))
                res++;
        }
        return res;
    }
}
