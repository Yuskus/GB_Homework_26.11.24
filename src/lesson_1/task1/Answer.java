package lesson_1.task1;

class Answer {
    int factorial(int n) {
        if (n < 0 || n > 12)
            return -1;
        if (n == 0)
            return 1;
        for (int i = n - 1; i > 1; i--) {
            n *= i;
        }
        return n;
    }
}
