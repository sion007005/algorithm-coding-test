package sion.study.algorithmcodingtest.programmers.level1;

// TEST 없는 숫자 더하기
public class Test2 {
    public int solution(int[] numbers) {
        int total = 0;

        for (int i = 0; i <= 9; i++) {
            total += i;
        }


        for (int number : numbers) {
            total -= number;
        }

        return total;
    }
}

// Solution details
// 0부터 9까지 다 더하고, 배열에 들어있는 숫자를 다 빼줬다. 