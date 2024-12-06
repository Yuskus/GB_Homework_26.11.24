/*Дан LinkedList с несколькими элементами. В методе removeOddLengthStrings 
класса LLTasks реализуйте удаление строк, длина которых нечетная. 
Используйте LinkedList и стандартные методы. */

package lesson4.task1;

import java.util.LinkedList;

public class Task {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        if (args.length == 0) {
            ll.add("apple");
            ll.add("banana");
            ll.add("pear");
            ll.add("grape");
        } else {
            for (String arg : args) {
                ll.add(arg);
            }
        }
        System.out.println(ll);
        LLTasks.removeOddLengthStrings(ll);
        System.out.println(ll);
    }
}
