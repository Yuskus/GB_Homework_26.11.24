package lesson_1.task4;

public class Task {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 3;

        if (args.length == 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        }

        Answer ans = new Answer();
        int res = ans.findMaxOfThree(a, b, c);
        System.out.println(res);
    }
}