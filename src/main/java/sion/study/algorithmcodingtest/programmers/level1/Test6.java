package sion.study.algorithmcodingtest.programmers.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// TEST 2021 카카오 채용연계형 인턴십 '숫자 문자열과 영단어'
public class Test6 {
    public int solution(String s) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<>() {
            {
                put("one", 1);
                put("two", 2);
                put("three", 3);
                put("four", 4);
                put("five", 5);
                put("six", 6);
                put("seven", 7);
                put("eight", 8);
                put("nine", 9);
                put("zero", 0);
            }
        };

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            s = s.replaceAll(entry.getKey(), String.valueOf(entry.getValue()));
        }

        answer = Integer.parseInt(s);
        return answer;
    }
}

// Solution Details
// map을 순회하면서, 해당 key 값을 가진 문자 부분을 전부 숫자로 바꾸도록 풀었다.