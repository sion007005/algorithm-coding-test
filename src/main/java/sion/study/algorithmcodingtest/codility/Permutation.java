package sion.study.algorithmcodingtest.codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Permutation {
    public int solution(int[] A) {
        int length = A.length;
        if (length == 1 && A[0] != 1) {
            return 0;
        }

        List<Integer> numbers = Arrays.stream(A).boxed().collect(Collectors.toList());
        Set<Integer> numberSet = new HashSet<>(numbers);
        if (numberSet.size() != length) {
            return 0;
        }

        int test = (length * (length + 1)) / 2;
        Integer sum = numbers.stream().reduce(0, Integer::sum);
        if (sum != test) {
            return 0;
        }

        return 1;
    }
}
