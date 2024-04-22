package basicTest;

import java.util.ArrayList;
import java.util.Arrays;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/181927
 마지막 두 원소
 - 정수 리스트 num_list가 주어질 때,
 - 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
 제한사항
 - 2 ≤ num_list의 길이 ≤ 10
 - 1 ≤ num_list의 원소 ≤ 9
 입출력 예
 - num_list	        result
 - [2, 1, 6]	    [2, 1, 6, 5]
 - [5, 2, 1, 7, 5]	[5, 2, 1, 7, 5, 10]
 입출력 예 설명
 - 입출력 예 #1 : 마지막 원소인 6이 그전 원소인 1보다 크기 때문에 6 - 1인 5를 추가해 return합니다.
 - 입출력 예 #2 : 마지막 원소인 5가 그전 원소인 7보다 크지 않기 때문에 5의 두 배인 10을 추가해 return합니다.
 */
public class LastTwoElements {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int[] resultValue = {2, 1, 6, 5};

        int[] solution = solution(num_list);
        if (Arrays.equals(solution, resultValue)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int[] solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : num_list) {
            list.add(num);
        }
        int last = list.get(list.size() - 1);
        int secondLast = list.get(list.size() - 2);
        int tempValue = last > secondLast ? last - secondLast : last * 2;

        list.add(tempValue);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
