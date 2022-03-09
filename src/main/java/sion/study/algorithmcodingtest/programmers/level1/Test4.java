package sion.study.algorithmcodingtest.programmers.level1;

import java.util.Arrays;

// TEST 완주하지 못한 선수
public class Test4 {
    public String solution(String[] participant, String[] completion) {
        int completionLength = completion.length;
        if (completionLength == 0) {
            return participant[0];
        }

        Arrays.sort(completion);
        Arrays.sort(participant);

        for (int i = 0; i < participant.length; i++) {
            if (i == completionLength) {
                return participant[i];
            }

            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return null;
    }
}

//Solution Details
// 두 배열을 정렬하고, 참가자 배열을 기준으로 순서대로 하나씩 비교해서
// 참자가의 이름과 완주자의 이름이 다른 지점이 오면 참가자의 이름을 반환하는 식으로 풀었다.

// 정확성은 통과하지만 효율성은 실패한 코드
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        if (completion.length == 0) {
//            return participant[0];
//        }
//
//        Arrays.sort(completion);
//        Arrays.sort(participant);
//
//        List<String> completionList = new ArrayList<>(Arrays.asList(completion));
//
//        for (String person : participant) {
//            // participantList.remove(person);
//            if (!completionList.contains(person)) {
//                return person;
//            }
//
//            completionList.remove(person);
//        }
//
//        return null;
//    }
//}
