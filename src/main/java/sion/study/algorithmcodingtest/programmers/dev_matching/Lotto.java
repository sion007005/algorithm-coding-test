package sion.study.algorithmcodingtest.programmers.dev_matching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Integer> standard = new HashMap<>();
        standard.put(0, 6);
        standard.put(1, 6);
        standard.put(2, 5);
        standard.put(3, 4);
        standard.put(4, 3);
        standard.put(5, 2);
        standard.put(6, 1);

        List<Integer> winNumberList = Arrays.stream(win_nums).boxed().collect(Collectors.toList());
        int zeroCount = (int) Arrays.stream(lottos).filter(w -> w == 0).count();
        int winCount = 0;

        for (Integer number : lottos) {
            if (winNumberList.contains(number)) {
                winCount++;
            }
        }

        int[] answer = new int[2];
        answer[0] = standard.get(winCount + zeroCount);
        answer[1] = standard.get(winCount);

        return answer;
    }
}
