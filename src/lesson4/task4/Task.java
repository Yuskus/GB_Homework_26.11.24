/* Реализуйте метод rotateDeque в классе DequeTasks, который 
принимает Deque<Integer> и число n. Метод должен повернуть очередь 
вправо на n позиций. Если n отрицательное, повернуть влево.*/

package lesson4.task4;

import java.util.Deque;
import java.util.LinkedList;

public class Task {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        int n;
        if (args.length == 0) {
            deque.add(1);
            deque.add(2);
            deque.add(3);
            deque.add(4);
            n = 2;
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                deque.add(Integer.parseInt(args[i]));
            }
            n = Integer.parseInt(args[args.length - 1]);
        }
        System.out.println(deque);
        DequeTasks.rotateDeque(deque, n);
        System.out.println(deque);
    }
}
