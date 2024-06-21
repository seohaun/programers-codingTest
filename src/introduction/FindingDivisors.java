package introduction;

import java.util.ArrayList;
import java.util.List;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120897
 약수 구하기
 - 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

 */
public class FindingDivisors {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
