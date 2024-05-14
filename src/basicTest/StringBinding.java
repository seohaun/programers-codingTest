package basicTest;

import java.util.Arrays;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/181855
 문자열 묶기
 - 문자열 배열 strArr이 주어집니다.
 - strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
 제한사항
 - 1 ≤ strArr의 길이 ≤ 100,000
 - 1 ≤ strArr의 원소의 길이 ≤ 30
 - strArr의 원소들은 알파벳 소문자로 이루어진 문자열입니다.
 입출력 예
 - strArr	                    result
 - ["a","bc","d","efg","hi"]	2
 */
public class StringBinding {
    public static void main(String[] args) {
        String[] strArr = {"a", "bc", "d", "efg", "hi"};

        int solution = solution(strArr);
        if (solution == 2) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int solution(String[] strArr) {
        int[] intArr = new int[31];
        for (String str : strArr) {
            intArr[str.length()]++;
        }
        return Arrays.stream(intArr).max().getAsInt();
    }
}
