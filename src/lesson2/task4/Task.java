/*Реализуйте метод поиска минимального и максимального элементов массива.
 После нахождения каждого элемента (минимального и максимального),
 сделайте запись в лог-файл log.txt в формате
 год-месяц-день час:минуты {минимальный элемент}, {максимальный элемент}. */

package lesson2.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] arr;
        if (args.length == 1) {
            arr = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        } else {
            arr = new int[] { 9, 4, 8, 3, 1 };
        }
        ArrayOperations ans = new ArrayOperations();
        ans.findMinMax(arr);
        // Проверка:
        try (BufferedReader br = new BufferedReader(new FileReader(ans.getLogFileName()))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}