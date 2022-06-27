package sion.study.algorithmcodingtest.codility;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class MaxProductOfThree {
    public int solution(int[] A) {
        Integer[] arr = Arrays.stream(A).boxed().toArray(Integer[]::new);
        int length = A.length;

        if (length == 3) {
            return multiply(arr);
        }

        Arrays.sort(arr, Collections.reverseOrder());
        if (arr[length-1] < 0) {

        }

        return multiply(Arrays.copyOfRange(arr, 0, 3));
    }

    private int multiply(Integer[] A) {
        System.out.println(" 얘네들 곱해  A = " + Arrays.toString(A));
        int result = 1;

        for (int i : A) {
            result *= i;
        }

        return result;
    }
}
