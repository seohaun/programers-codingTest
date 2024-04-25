package basicTest;

import java.util.Arrays;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/181922
 수열과 구간 쿼리4
 - 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
 - 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더합니다.
 - 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
 제한사항
 - 1 ≤ arr의 길이 ≤ 1,000
 - 0 ≤ arr의 원소 ≤ 1,000,000
 - 1 ≤ queries의 길이 ≤ 1,000
 - 0 ≤ s ≤ e < arr의 길이
 - 0 ≤ k ≤ 5
 입출력 예
 - arr	            queries	                            result
 - [0, 1, 2, 4, 3]	[[0, 4, 1],[0, 3, 2],[0, 3, 3]]	    [3, 2, 4, 6, 4]
 입출력 예 설명
 - 각 쿼리에 따라 arr가 다음과 같이 변합니다.
 - arr
   [0, 1, 2, 4, 3]
   [1, 2, 3, 5, 4]
   [2, 2, 4, 5, 4]
   [3, 2, 4, 6, 4]
 - 따라서 [3, 2, 4, 6, 4]을 return 합니다.
 */
public class SequenceAndIntervalQueries4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        int[] resultValue = {3, 2, 4, 6, 4};

        int[] solution = solution(arr, queries);
        if (Arrays.equals(solution, resultValue)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for(int [] querie : queries){
            for(int i=querie[0]; i<answer.length; i++){
                if(i<=querie[1]){
                    answer[i] = i % querie[2] == 0 ? answer[i]+1 : answer[i];
                }
            }
        }
        return answer;
    }
}
