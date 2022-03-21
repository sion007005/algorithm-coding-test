package sion.study.algorithmcodingtest.programmers.dev_matching;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

// 2021 Dev-Matching 백엔드 문제
// 로또의 최고 순위와 최저 순위
public class Solution1 {
    public int[] solution(int[] lottos, int[] win_nums) {

        Map<Integer, Integer> standard = new HashMap<>();
        standard.put(6, 1);
        standard.put(5, 2);
        standard.put(4, 3);
        standard.put(3, 4);
        standard.put(2, 5);
        standard.put(1, 6);
        standard.put(0, 6);

        int[] answer = new int[2];
        int count = 0;
        int zeroCount = 0;

        List<Integer> winNumberList = new ArrayList<>();
        for (int winNumber : win_nums) {
            winNumberList.add(winNumber);
        }

        for (int lottoNumber : lottos) {
            if (lottoNumber == 0) {
                zeroCount++;
                continue;
            }

            if (winNumberList.contains(lottoNumber)) {
                count++;
            }
        }

        int max = count + zeroCount;

        if (zeroCount == 6) {
            answer[0] = 1;
            answer[1] = 6;

            return answer;
        }

        if (max >= 2 && max <= 6) {
            answer[0]  = standard.get(max);
            answer[1] = standard.get(count);
        } else {
            answer[0] = 6;
            answer[1] = 6;
        }

        return answer;
    }
}
// Solution Details
// 1. 채점의 기준이 되는 당첨 갯수/순위를 Map에 저장
// 2. count = 로또를 구매한 사람의 번호와 로또 당첨 번호가 일치하는 수
// 3. zeroCount = 로또를 구매한 사람의 알 수 없는 번호 갯수
// 4. count + zeroCount가 곧 최대로 맞출 수 있는 갯수라는 것에 착안해서 풀었다.