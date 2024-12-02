/*Реализуйте метод, который принимает на вход массив строк и возвращает
 новый массив, содержащий только строки, длина которых больше 3 символов.*/

package lesson3.task3;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        String[] arr;
        if (args.length == 0) {
            arr = new String[] { "cat", "elephant", "dog", "giraffe" };
        } else {
            arr = args[0].split(", ");
        }
        FilterStrings answer = new FilterStrings();
        String result = Arrays.toString(answer.filterShortStrings(arr));
        System.out.println(result);
    }
}
