/* Реализуйте метод countOccurrences в классе ListUtils, который 
принимает LinkedList<String> и строку, и возвращает количество 
вхождений строки в список.*/

package lesson4.task3;

import java.util.Arrays;
import java.util.LinkedList;

public class Task {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        String value;
        if (args.length < 2) {
            list.add("apple");
            list.add("banana");
            list.add("apple");
            list.add("pear");
            list.add("banana");
            value = "apple";
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                list.add(args[i]);
            }
            value = args[args.length - 1];
        }
        System.out.println("List is" + Arrays.toString(list.toArray()));
        System.out.println("Occurrences of \"" + value + "\": " + ListUtils.countOccurrences(list, value));
    }
}
