package lesson5.task4;

import java.util.Arrays;

class MergeSort {
    private static void merge(int[] left, int[] right, int[] result) {
        for (int i = 0, l = 0, r = 0; i < result.length; i++) {
            if (l == left.length && r < right.length)
                result[i] = right[r++];
            else if (r == right.length && l < left.length)
                result[i] = left[l++];
            else
                result[i] = left[l] < right[r] ? left[l++] : right[r++];
        }
    }

    public static void mergeSort(int[] array) {
        if (array == null || array.length < 2)
            return;

        int middle = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, array.length);

        mergeSort(left);
        mergeSort(right);

        merge(left, right, array);
    }
}
