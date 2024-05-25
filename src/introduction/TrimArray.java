package introduction;

import java.util.Arrays;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120833
 배열 자르기
 - 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.

 한줄로 가능한 아주 간단한 함수 사용.... Arrays.copyOfRange(numbers, num1, num2 + 1);
 */
public class TrimArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] resultValue = {2, 3, 4};

        int[] solution = solution(numbers,1,3);
        if (Arrays.equals(solution, resultValue)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int count = 0;
        for(int i=num1; i<=num2; i++){
            answer[count] = numbers[i];
            count++;
        }
        return answer;
        //return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
