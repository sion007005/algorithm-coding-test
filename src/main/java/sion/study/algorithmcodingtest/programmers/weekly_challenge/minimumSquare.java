package sion.study.algorithmcodingtest.programmers.weekly_challenge;

import java.util.*;

public class minimumSquare {
    public class MinimumSquare {
        public int solution(int[][] sizes) {
            int length = sizes.length;
            List<Integer> widthList = new ArrayList<>();
            List<Integer> heightList = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                int width = sizes[i][0];
                int height = sizes[i][1];

                if (width < height) {
                    widthList.add(height);
                    heightList.add(width);
                }

                if (width >= height) {
                    widthList.add(width);
                    heightList.add(height);
                }
            }

            Collections.sort(widthList);
            Collections.sort(heightList);

            return widthList.get(length - 1) * heightList.get(length - 1);
        }
    }
// Solution
// 명함을 회전시키면 가로도 되고, 세로도 될 수 있음
// 만약 가로가 세로보다 짧다면 돌려서 세로가 가로가 되도록 한다.
// 주어지는 가로배열 세로배열에 상관없이,
// 긴 쪽을 가로 리스트에, 짧은 쪽을 세로 리스트에 넣고
// 가로값 중 가장 큰 값과 세로값 중 가장 큰 값을 곱하면 된다.
}
