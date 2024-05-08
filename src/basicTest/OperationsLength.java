package basicTest;

import java.util.Arrays;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/181879
 길이에 따른 연산
 - 정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
 제한사항
 - 2 ≤ num_list의 길이 ≤ 20
 - 1 ≤ num_list의 원소 ≤ 9
 - num_list의 원소를 모두 곱했을 때 2,147,483,647를 넘는 입력은 주어지지 않습니다.
 입출력 예
 - num_list	                                result
 - [3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1]	51
 - [2, 3, 4, 5]	                            120
 */
public class OperationsLength {

    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};

        int solution = solution(num_list);
        if (solution == 51) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int solution(int[] num_list) {
        return num_list.length >= 11 ? Arrays.stream(num_list).sum() : Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
    }

}
