package sion.study.algorithmcodingtest.programmers.weekly_challenge;

// TEST 부족한 금액 계산하기
public class Test1 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;

        for (int i = 1; i <= count; i++) {
            total += (price * i);
        };

        answer = (total - money);

        if (answer <= 0) {
            answer = 0;
        }

        return answer;
    }
}
// Solution Details
// 놀이기구를 count 만큼 타는데 드는 비용을 먼저 구하고,
// 가지고 있는 돈에서 뺀 다음에 반환해줘야 하는 값에 맞게 answer에 할당한다. 