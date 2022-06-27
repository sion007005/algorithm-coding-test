package sion.study.algorithmcodingtest.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PassingCars {
    public int solution(int[] A) {
        int length = A.length;

        if (length == 1) {
            return 0;
        }

        int count = 0;
        List<Integer> numbers = Arrays.stream(A).boxed().collect(Collectors.toList());


        for (int i = 0; i < length; i++) {
            int now = A[i];

            if (now == 0) {
                count += numbers.subList(i + 1, length).stream().filter(n -> n == 1).count();
            }
        }

        return count;
    }
}
