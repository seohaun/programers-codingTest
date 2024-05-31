package introduction;

import java.util.Arrays;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120842
 2차원 배열 만들기
 - 정수 배열 num_list와 정수 n이 매개변수로 주어집니다. num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
 - num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다.
 - 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.

 */
public class CreateTwoArray {

    public static void main(String[] args) {
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int[][] resultValue = {{100, 95, 2}, {4, 5, 6}, {18, 33, 948}};

        int[][] solution = solution(num_list,3);
        if (Arrays.deepEquals(solution, resultValue)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        for(int i=0; i<num_list.length; i++){
            answer[i/n][i%n]=num_list[i];
        }
        return answer;
    }
}
