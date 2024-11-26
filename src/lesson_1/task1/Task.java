package lesson_1.task1;

public class Task {
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        Answer ans = new Answer();
        int res = ans.factorial(n);
        System.out.println("Факториал числа " + n + " равен: " + res);
    }
}