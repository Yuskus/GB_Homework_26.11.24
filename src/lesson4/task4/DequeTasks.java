package lesson4.task4;

import java.util.Deque;

class DequeTasks {
    static void rotateDeque(Deque<Integer> deque, int n) {
        if (deque == null || deque.isEmpty())
            return;
        for (int i = 0; i < Math.abs(n) % deque.size(); i++) {
            if (n > 0)
                deque.addLast(deque.removeFirst());
            else
                deque.addFirst(deque.removeLast());
        }
    }
}
