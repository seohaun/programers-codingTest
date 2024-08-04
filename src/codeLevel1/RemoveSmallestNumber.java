package codeLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/12935
 제일 작은 수 제거
 - 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 - 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

 1.arr 복제를 만들어서 정렬한 후 가장 최소값 구하기
 2.arr 반복문 조건 : 최소값과 같지 않으면 answer 리스트에 추가
 3.answer리스트를 배열로 변환, size가 0 이면 배열에 -1만 반환

 다른 사람 풀이
 최소값 구하기          : int min = Arrays.stream(arr).min().getAsInt();
 최소값을 뺀 배열 만들기 :  return Arrays.stream(arr).filter(i -> i != min).toArray();
 */
public class RemoveSmallestNumber {
    public int[] solution(int[] arr) {
        int[] sortArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortArr);
        int smallNum = sortArr[0];

        List<Integer> answer = new ArrayList<>();
        for (int j : arr) {
            if (j != smallNum) {
                answer.add(j);
            }
        }
        return answer.size() > 0 ? answer.stream().mapToInt(Integer::intValue).toArray() : new int[]{-1};
    }
}
