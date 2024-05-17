package basicTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/181844
 배열의 원소 삭제하기
 - 정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
 제한사항
 - 1 ≤ arr의 길이 ≤ 100
 - 1 ≤ arr의 원소 ≤ 1,000
 - arr의 원소는 모두 서로 다릅니다.
 - 1 ≤ delete_list의 길이 ≤ 100
 - 1 ≤ delete_list의 원소 ≤ 1,000
 - delete_list의 원소는 모두 서로 다릅니다.
 입출력 예
 - arr	                        delete_list	                    result
 - [293, 1000, 395, 678, 94]	[94, 777, 104, 1000, 1, 12]	    [293, 395, 678]
 - [110, 66, 439, 785, 1]	    [377, 823, 119, 43]	            [110, 66, 439, 785, 1
 */
public class DeletingElements {
    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        int[] resultValue = {293, 395, 678};

        int[] solution = solution(arr, delete_list);
        if (Arrays.equals(solution, resultValue)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int [] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for (int num : arr) {
            answer.add(num);
        }
        for(int delete : delete_list){
            if(answer.contains(delete)) answer.remove(answer.indexOf(delete));
        }
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
