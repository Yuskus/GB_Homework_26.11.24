/*Напишите программу, которая реализует сортировку слиянием. Программа  
   должна содержать два основных метода: merge для объединения двух  
   отсортированных массивов в один отсортированный, и mergeSort для  
   сортировки массива с использованием сортировки слиянием. */

package lesson5.task4;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] initArray;
        if (args.length == 0) {
            initArray = new int[] { 38, 27, 43, 3, 9, 82, 10 };
        } else {
            initArray = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        MergeSort.mergeSort(initArray);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}
