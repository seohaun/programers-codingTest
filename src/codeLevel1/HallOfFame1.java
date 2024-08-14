package codeLevel1;

import java.util.PriorityQueue;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/138477?language=java
 명예의 전당(1)
 - 이 프로그램에서는 매일 "명예의 전당"의 최하위 점수를 발표합니다.
 - 예를 들어, k = 3이고, 7일 동안 진행된 가수의 점수가 [10, 100, 20, 150, 1, 100, 200]이라면, 명예의 전당에서 발표된 점수는 아래의 그림과 같이 [10, 10, 10, 20, 20, 100, 100]

 PriorityQueue( 높은 우선순위의 요소를 먼저 꺼내서 처리하는 구조 )를 사용
 */
public class HallOfFame1 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        //낮은 숫자가 우선 순위인 int 형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();
        int answerIdx = 0;
        for(int num:score){
            if(priorityQueueLowest.size() < k){
                priorityQueueLowest.add(num);
            }else if(num >= priorityQueueLowest.peek()){
                priorityQueueLowest.poll();
                priorityQueueLowest.add(num);
            }
            answer[answerIdx++]=priorityQueueLowest.peek();
        }
        return answer;
    }
}
