package introduction;

import java.util.Arrays;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120844
 배열 회전시키기
 - 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.

 */
public class RotateArray {
    public static void main(String[] args) {
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        int[] resultValue = {455, 6, 4, -1, 45, 6, 4};

        int[] solution = solution(numbers, "left");
        if (Arrays.equals(solution, resultValue)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int index = 0;
        if("right".equals(direction)){
            index = numbers.length-1;
        }
        if("left".equals(direction)){
            index = 1;
        }
        for(int i=0; i<numbers.length; i++){
            answer[i] = numbers[index];
            index = index == numbers.length-1 ? 0 : index + 1;
        }
        return answer;
    }
}
