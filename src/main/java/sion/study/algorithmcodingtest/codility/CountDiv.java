package sion.study.algorithmcodingtest.codility;

public class CountDiv {
    public int solution(int A, int B, int K) {
        if (B == 0 || B == K) {
            return 1;
        }

        int rangeDiff = B - A;
        if (rangeDiff == 0) {
            return B % K == 0 ? 1 : 0;
        }

        if (K == 1) {
            return (B - A) + 1;
        }

        int start = A;
        int count = 0;
        for (int s = 0; s < rangeDiff + 1; s++) {
            if (start % K == 0) {
                count++;
            }

            start++;
        }

        return count;
    }
}
