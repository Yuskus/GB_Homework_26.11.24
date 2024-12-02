/*Напишитеметод,которыйпринимаетмассивцелыхчиселивозвращает
 среднеезначениеэлементовмассива,округленноедоближайшегоцелого
 числа. */

package lesson3.task4;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            a = new int[] { 4, 2, 7, 5, 1 };
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        AverageCalculator answer = new AverageCalculator();
        int result = answer.calculateAverage(a);
        System.out.println(result);
    }
}
