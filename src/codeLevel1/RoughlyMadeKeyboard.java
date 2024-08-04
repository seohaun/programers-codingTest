package codeLevel1;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/160586
 대충 만든 자판
 - 1번 키부터 차례대로 할당된 문자들이 순서대로 담긴 문자열배열 keymap, 입력하려는 문자열들이 담긴 문자열 배열 targets
 - 각 문자열을 작성하기 위해 키를 최소 몇 번씩 눌러야 하는지 순서대로 배열에 담아 return 하는 solution 함수를 완성

 1. A~Z까지 배열 만들어서 최소가 몇 인지 계산하기 / targets에 단어만큼 계산
 */
public class RoughlyMadeKeyboard {
    public int[] solution(String[] keymap, String[] targets) {
        int[] alphabet = new int[26];
        int[] answer = new int[targets.length];
        for (String key : keymap) {
            int keyChrArrayCount = 1;
            for (char keyChar : key.toCharArray()) {
                if (alphabet[keyChar - 65] == 0 || alphabet[keyChar - 65] > keyChrArrayCount)
                    alphabet[keyChar - 65] = keyChrArrayCount;
                keyChrArrayCount++;
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int totalCount = 0;
            for (char keyChar : targets[i].toCharArray()) {
                if(alphabet[keyChar - 65] == 0) {
                    totalCount = 0;
                    break;
                }
                totalCount += alphabet[keyChar - 65];
            }
            answer[i] = totalCount == 0 ? -1 : totalCount;
        }
        return answer;
    }
}
