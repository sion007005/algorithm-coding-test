package sion.study.algorithmcodingtest.programmers.level1;

import java.util.HashSet;
import java.util.Set;

// TEST 포켓몬
public class Test3 {
    public int solution(int[] nums) {
        Set<Integer> numberSet = new HashSet<>();
        for (int num : nums) {
            numberSet.add(num);
        }

        int setSize = numberSet.size();
        int pickNum = nums.length / 2;

        if (setSize >= pickNum) {
            return pickNum;
        }

        return setSize;
    }
}
// Solution details
// 배열에 담긴 모든 숫자를 Set에 추가해 중복을 제거한다.
// 선택할 수 있는 포켓몬 수(pickNum)보다 Set에 담긴 숫자의 수가 많으면
// pickNum만큼의 종류를 가져갈 수 있다는 의미로 생각하고 풀었다.