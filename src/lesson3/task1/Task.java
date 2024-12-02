/*Реализуйте метод, который принимает на вход целочисленный массив и
 удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
 только неотрицательные числа. */

package lesson3.task1;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            a = new int[] { -1, 2, -3, 4, -5, 6 };
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        FilterNegative answer = new FilterNegative();
        String result = Arrays.toString(answer.filterNegative(a));
        System.out.println(result);
    }
}
