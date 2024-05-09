package basicTest;

import java.util.Arrays;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/181902
 문자 갯수 세기
 - 알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, my_string에서 'A'의 개수, my_string에서 'B'의 개수,
  ..., my_string에서 'Z'의 개수, my_string에서 'a'의 개수, my_string에서 'b'의 개수,...,
  my_string에서 'z'의 개수를 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.
 제한사항
 - 1 ≤ my_string의 길이 ≤ 1,000
 입출력 예
 - my_string	    result
 - "Programmers"	[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]
 */
public class CountingCharacters {
    public static void main(String[] args) {
        int[] resultValue = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0};

        int[] solution = solution("Programmers");
        if (Arrays.equals(solution, resultValue)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int[] solution(String my_string) {
        int[] answer = new int[52];
        for (char ch : my_string.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                answer[ch - 'A']++;
            }
            if (ch >= 'a' && ch <= 'z') {
                answer[26 + ch - 'a']++;
            }
        }
        return answer;
    }
}
