package lesson_1.task4;

public class Answer {
    int findMaxOfTwo(int a, int b) {
        return a > b ? a : b;
    }

    int findMaxOfThree(int a, int b, int c) {
        return findMaxOfTwo(findMaxOfTwo(a, b), c);
    }
}
