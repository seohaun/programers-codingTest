package basicTest;

import java.util.Arrays;

/*
 리스트 자르기
 https://school.programmers.co.kr/learn/courses/30/lessons/181897
 - 정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다.
 - slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
 - n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
 - n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
 - n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
 - n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
 - 올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.
 제한사항
 - n 은 1, 2, 3, 4 중 하나입니다.
 - slicer의 길이 = 3
 - slicer에 담긴 정수를 차례대로 a, b, c라고 할 때
   0 ≤ a ≤ b ≤ num_list의 길이 - 1
   1 ≤ c ≤ 3
   5 ≤ num_list의 길이 ≤ 30
   0 ≤ num_list의 원소 ≤ 100
 입출력 예
 - n	slicer	    num_list	                    result
 - 3	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	    [2, 3, 4, 5, 6]
 - 4	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	    [2, 4, 6]
 */
public class TruncateList {
    public static void main(String[] args) {
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] resultValue = {2, 3, 4, 5, 6};
        int[] solution = solution(3,slicer,num_list);
        if (Arrays.equals(solution, resultValue)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int resultIndex = 0;
        int[] answer = switch (n) {
            case 1 -> Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
            case 2 -> Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            case 3 -> Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
            case 4 -> answer = new int[(slicer[1] - slicer[0]) / slicer[2] + 1];
            default -> new int[0];
        };
        if (n == 4) {
            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                answer[resultIndex++] = num_list[i];
            }
        }
        return answer;
    }
}
