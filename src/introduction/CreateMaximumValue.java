package introduction;

import java.util.Arrays;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120862
 최댓값 만들기2
 - 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

 배열을 정렬한후 0,1 번째 곱한값과 마지막, 마지막-1 번째 값을 곱한후에 비교하여 더 큰 숫자를 반환하는 로직으로 작성
 */
public class CreateMaximumValue {

    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = Math.max(numbers[0] * numbers[1], numbers[numbers.length - 2] * numbers[numbers.length - 1]);
        return answer;
    }
}
