package sion.study.algorithmcodingtest.programmers.dev_matching;

import java.util.*;

// TEST 키패드 누르기 (2020 카카오 인턴십)
public class Solution3 {
    List<Integer> left = new ArrayList<>(Arrays.asList(1, 4, 7));
    List<Integer> right = new ArrayList<>(Arrays.asList(3, 6, 9));
    List<Integer> both = new ArrayList<>(Arrays.asList(2, 5, 8, 0));

    Map<Integer, ArrayList> location = new HashMap<>() {
        {
            put(-2, new ArrayList<>(Arrays.asList(0, 0)));
            put(-1, new ArrayList<>(Arrays.asList(2, 0)));
            put(0, new ArrayList<>(Arrays.asList(1, 0)));
            put(1, new ArrayList<>(Arrays.asList(0, 4)));
            put(2, new ArrayList<>(Arrays.asList(1, 4)));
            put(3, new ArrayList<>(Arrays.asList(2, 4)));
            put(4,new ArrayList<>(Arrays.asList(0, 2)));
            put(5, new ArrayList<>(Arrays.asList(1, 3)));
            put(6, new ArrayList<>(Arrays.asList(2, 2)));
            put(7, new ArrayList<>(Arrays.asList(0, 1)));
            put(8, new ArrayList<>(Arrays.asList(1, 1)));
            put(9, new ArrayList<>(Arrays.asList(2, 1)));
        }
    };

    public String solution(int[] numbers, String hand) {
        String answer = "";
        hand = hand.equals("right") ? "R" : "L";

        Integer rightLocation = -1;
        Integer leftLocation = -2;

        for (int i = 0; i < numbers.length; i++) {
            int now = numbers[i];

            if (right.contains(now)) {
                answer += "R";
                rightLocation = now;
                continue;
            }

            if (left.contains(now)) {
                answer += "L";
                leftLocation = now;
                continue;
            }

            int leftMove = getDistance(leftLocation, now);
            int rightMove = getDistance(rightLocation, now);

            if (leftMove == rightMove) {
                answer += hand;
                continue;
            }

            answer += (leftMove > rightMove ? "R" : "L");
        }

        return answer;
    }

    private Integer getDistance(Integer from, Integer to) {
        Integer fromX = (Integer) location.get(from).get(0);
        Integer fromY = (Integer) location.get(from).get(1);

        Integer toX = (Integer) location.get(to).get(0);
        Integer toY = (Integer) location.get(to).get(1);

        Integer distance = Math.abs(fromX - toX) + Math.abs(fromY - toY);

        return distance;
    }
}
// Solution Details
// 1. 키패드의 위치를 좌표에 놓았다. (맨 왼쪽 하단을 0,0으로 가정)
// 2. 무조건 왼쪽/오른쪽으로 눌러야 하는 자리와 그 외의 자리를 배열로 구분
// 3. 손의 위치를 저장하고, 이동해야하는 좌표까지 거리를 구한다.
