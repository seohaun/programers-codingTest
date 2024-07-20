package introduction;

import java.util.Arrays;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/12933
 정수 내림차순으로 배치하기
 - 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

 long n을 char 배열로 변환하고 Arrays.sort 함수로 오름차순 정렬. 그후에 StringBuilder의 reverse로 내림차순 정렬. ( GPT의 도움을 받음.. )
 */
public class SortIntegerDescending {
    public long solution(long n) {
        char[] digits = Long.toString(n).toCharArray();
        Arrays.sort(digits);
        StringBuilder sortedStr = new StringBuilder(new String(digits)).reverse();
        return Long.parseLong(sortedStr.toString());
    }
}
