package sion.study.algorithmcodingtest.codility;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public int solution(int[] A) {
        int length = A.length;
        Set<Integer> numbers = new HashSet<>();

        if (A.length == 0) {
            return 0;
        }

        for (int i : A) {
            numbers.add(i);
        }

        return numbers.size();
    }
}
