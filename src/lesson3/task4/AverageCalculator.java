package lesson3.task4;

class AverageCalculator {
    int calculateAverage(int[] a) {
        if (a == null || a.length == 0)
            return 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return (int) Math.round((double) sum / a.length);
    }
}
