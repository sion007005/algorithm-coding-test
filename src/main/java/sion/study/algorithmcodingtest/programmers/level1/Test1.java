package sion.study.algorithmcodingtest.programmers.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// TEST 두 개 뽑아서 더하기
public class Test1 {
    public int[] solution(int[] numbers) {
        Set<Integer> answerSet = new TreeSet<>();
        int size = numbers.length;

        for (int i = 0; i < size - 1; i++) {
            int standard = numbers[i];

            for (int k = i+1; k < size; k++) {
                int added = standard + numbers[k];
                answerSet.add(added);
            }
        }

        List<Integer> answerNumberList = new ArrayList<>(answerSet);
        // Collections.sort(answerNumberList);
        System.out.println("answerNumberList = " + answerNumberList);
        return answerNumberList.stream().mapToInt(Integer::intValue).toArray();
    }
}

// Solution details
// 처음에는 HashSet에 더한 값을 모두 넣고, arrayList로 변환한 뒤 Collections.sort(answerNumberList)를 통해 정렬했는데
// 중복을 허용하지 않으면서 정렬이 되는 TreeSet으로 변경