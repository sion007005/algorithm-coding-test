package sion.study.algorithmcodingtest.programmers.dev_matching;

import java.util.ArrayList;
import java.util.List;

// 직사각형을 만들기 위한 나머지 한개 좌표 구하기
public class Solution2 {
    public int[] solution(int[][] v) {
        int[] answer = new int[2];
        int[] xArr = {};
        int[] yArr = {};

        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int x = v[i][0];
            int y = v[i][1];

            if (xList.contains(x)) {
                xList.remove(Integer.valueOf(x));
            } else {
                xList.add(x);
            }

            if (yList.contains(y)) {
                yList.remove(Integer.valueOf(y));
            } else {
                yList.add(y);
            }
        }

        answer[0] = xList.get(0);
        answer[1] = yList.get(0);

        return answer;
    }
}
// Solution Details
// 직사각형을 만들기 위해서 단 하나의 좌표만 더 필요하다면,
// 세 개의 점 중 유일하게 겹치지 않는 x 좌표한개와 y좌표 한개가 나머지 한 점의 좌표가 된다는 점에 착안해서 풀었다.
// 공부한 점은, List의 값을 삭제 할 때 remove 메소드를 이용 할 수 있는데
// 1. index 이용 -> remove(index)
// 2. 해당값(숫자)을 직접 지우고 싶다면 Object 타입으로 전달 -> remove(Integer.valueOf(int 숫자값))