package lesson4.task1;

import java.util.LinkedList;

class LLTasks {
    static void removeOddLengthStrings(LinkedList<String> ll) {
        if (ll == null || ll.size() == 0)
            return;
        for (int i = ll.size() - 1; i >= 0; i--) {
            if (ll.get(i).length() % 2 == 1) {
                ll.remove(i);
            }
        }
    }
}
