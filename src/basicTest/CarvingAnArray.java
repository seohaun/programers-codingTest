package basicTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/181893
 배열 조각하기
 - 정수 배열 arr와 query가 주어집니다.
 - query를 순회하면서 다음 작업을 반복합니다.
 - 짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
 - 홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
 - 위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.
 제한사항
 - 5 ≤ arr의 길이 ≤ 100,000
 - 0 ≤ arr의 원소 ≤ 100
 - 1 ≤ query의 길이 < min(50, arr의 길이 / 2)
 - query의 각 원소는 0보다 크거나 같고 남아있는 arr의 길이 보다 작습니다.
 입출력 예
 - arr	                query	    result
 - [0, 1, 2, 3, 4, 5]	[4, 1, 2]	[1, 2, 3]
 */
public class CarvingAnArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] queries = {4, 1, 2};
        int[] resultValue = {1, 2, 3};

        int[] solution = solution(arr, queries);
        if (Arrays.equals(solution, resultValue)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int [] solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();
        for(int x:arr) answer.add(x);

        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){
                for(int j = answer.size()-1; j > query[i]; j--)
                    answer.remove(j);
            }
            if(i % 2 != 0){
                for(int j = query[i]-1; j >= 0; j--)
                    answer.remove(j);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
