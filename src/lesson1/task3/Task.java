/* Напишите метод sumDigits, который принимает 
целое число n и возвращает сумму его цифр. */

package lesson1.task3;

public class Task {
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 12345;
        Answer ans = new Answer();
        int res = ans.sumDigits(n);
        System.out.println("Сумма цифр в числе " + n + " равна: " + res);
    }
}
