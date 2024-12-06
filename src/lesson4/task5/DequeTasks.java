package lesson4.task5;

import java.util.Deque;

class DequeTasks {
    static void removeAllOccurrences(Deque<String> deque, String value) {
        if (deque == null || value == null)
            return;
        if (deque.size() == 0 || value.length() == 0)
            return;
        deque.removeIf(x -> x.equals(value));
    }
}
