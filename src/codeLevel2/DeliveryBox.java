package codeLevel2;

import java.util.Stack;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/131704#
 택배 박스

 Stack 자료구조 변수를 보조컨베이어벨트로 사용
 보조 컨베이어 벨트에 값이 있는지 확인하고 있으면 box++ 하지않고 continue
 box에 값이 택배 기사님이 원하는 순서가 아니면 보조 컨베이어 벨트에 추가 ( 같은 같이 추가가 된다면 break : 택배 기사님이 원하는 대로 상자를 줄 수 없음 )

 다른사람 코드
 DeliveryBox_answer.java와 비교.. DeliveryBox_answer가 훨씬 가독성이 좋음
 */
public class DeliveryBox {
    public int solution(int[] order) {
        Stack<Integer> assistBeltStack = new Stack<>();
        int answer = 0;
        int box = 1;
        int orderIdx = 0;
        int orderLen = order.length;
        while(box <= orderLen){
            if(assistBeltStack.size() > 0 && assistBeltStack.peek() == order[orderIdx]){
                assistBeltStack.pop();
                if(orderIdx < orderLen-1)orderIdx++;
                answer++;
                continue;
            }
            if(order[orderIdx] != box){
                if(assistBeltStack.size() > 0 && box == assistBeltStack.peek()) break;
                assistBeltStack.push(box);
            }else {
                if(orderIdx < orderLen-1)orderIdx++;
                answer++;
            }
            if(box < orderLen)box++;
        }
        return answer;
    }
}
