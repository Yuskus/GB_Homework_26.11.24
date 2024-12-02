/*Напишите метод, который принимает целочисленный массив и возвращает
 новый массив, содержащий только уникальные элементы из исходного. */

package lesson3.task2;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            a = new int[] { 1, 2, 2, 3, 4, 4, 5 };
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        UniqueElements answer = new UniqueElements();
        String result = Arrays.toString(answer.getUniqueElements(a));
        System.out.println(result);
    }
}
