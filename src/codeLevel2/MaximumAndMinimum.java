package codeLevel2;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/12939?language=java
 최대값과 최솟값
 - 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
 - 예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

 1. s를 공백 기준으로 짤라서 int 배열로 변환
 2. int배열에서 최솟값, 최대값 구하기
 */
public class MaximumAndMinimum {
    public String solution(String s) {
        int[] sIntArray = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        return Arrays.stream(sIntArray).min().getAsInt()+" "+Arrays.stream(sIntArray).max().getAsInt();
    }
}
