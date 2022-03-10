package sion.study.algorithmcodingtest.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TEST 소수찾기(1부터 n까지의 자연수 중에서 소수의 개수를 반환하는 문제)
public class Test5 {
    // 에라토스테네스의 체 이용
    public int solution1(int n) {
        int[] arr = new int[n+1];
        int answer = 0;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                answer++;
                // System.out.println("i = " + i + "  그리고" + arr[i] + " = 0이다 answer = " + answer);
                for (int k = i; k <= n; k = k + i) {
                    arr[k] = 1;
                }
            }
        }
        return answer;
    }

    // 통과하지 못한 케이스 (소수로 나누어지는 케이스를 생각하지 못 함)
    public int solution2(int n) {
        Integer[] arr = {2, 3, 5, 7}; // 2,3,5,7 중에 하나로 나누어지면 소수가 아님
        int count = 0;

        List<Integer> checkList = new ArrayList<Integer>(Arrays.asList(arr));
        if (checkList.contains(n)) {
            return checkList.indexOf(n) + 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int num : arr) {
                if (i % num == 0 && i != num) {
                    count++;
                    break;
                }
            }
        }

        int answer = (n - 1) - count;
        return answer;
    }
}
