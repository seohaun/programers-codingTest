package codeLevel2;

import java.util.PriorityQueue;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/142085
 디펜스 게임

 priorityQueue 사용 ( 기본적으로 최소 힙(min-heap)으로 동작. 가장 작은 값이 가장 높은 우선순위를 가짐. )

 */
public class DefenseGame {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;

        PriorityQueue<Integer> que = new PriorityQueue<>();

        for (int j : enemy) {
            if (k > 0) {
                que.add(j);
                k--;
            } else {
                int num = j;
                if (que.peek() < j) {
                    num = que.poll();
                    que.add(j);
                }
                if (n >= num) {
                    n -= num;
                } else break;
            }
            answer++;
        }
        return answer;
    }
}
