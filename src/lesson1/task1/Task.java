/* Напишите метод factorial, который принимает число n и 
возвращает его факториал. Если n < 0, метод должен вернуть -1. */

package lesson1.task1;

public class Task {
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        Answer ans = new Answer();
        int res = ans.factorial(n);
        System.out.println("Факториал числа " + n + " равен: " + res);
    }
}