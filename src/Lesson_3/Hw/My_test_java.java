package Lesson_3.Hw;

import java.util.Arrays;

public class My_test_java {
    public static int[] mergeSort(int[] src) {
        if (src.length <= 1) return src;
        int[] left = Arrays.copyOfRange(src, 0, src.length / 2);
        System.out.println("work with left " + Arrays.toString(left));
        int[] right = Arrays.copyOfRange(src, left.length, src.length);
        System.out.println("work with right" + Arrays.toString(right));
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int resIn = 0, leftIn = 0, rightIn = 0;
        int[] result = new int[left.length + right.length];

        while (leftIn < left.length && rightIn < right.length)
            if (left[leftIn] < right[rightIn])
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        while (resIn < result.length)
            if (leftIn != left.length)
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];


        System.out.println(Arrays.toString(result));
        return result;
    }
}
