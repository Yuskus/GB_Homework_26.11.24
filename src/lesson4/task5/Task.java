/* Реализуйте метод removeAllOccurrences в классе DequeTasks, 
который принимает Deque<String> и строку value. Метод должен 
удалить все вхождения строки value из очереди. */

package lesson4.task5;

import java.util.Deque;
import java.util.LinkedList;

public class Task {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        String value;
        if (args.length < 2) {
            deque.add("apple");
            deque.add("banana");
            deque.add("apple");
            deque.add("cherry");
            value = "apple";
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                deque.add(args[i]);
            }
            value = args[args.length - 1];
        }
        System.out.println(deque);
        DequeTasks.removeAllOccurrences(deque, value);
        System.out.println(deque);
    }
}
