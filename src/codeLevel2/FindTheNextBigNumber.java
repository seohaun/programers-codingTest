package codeLevel2;

import java.util.Arrays;
import java.util.Stack;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/154539
 뒤에 있는 큰 수 찾기
 - 정수로 이루어진 배열 numbers가 있습니다. 배열 의 각 원소들에 대해 자신보다 뒤에 있는 숫자 중에서 자신보다 크면서 가장 가까이 있는 수를 뒷 큰수라고 합니다.
 - 정수 배열 numbers가 매개변수로 주어질 때, 모든 원소에 대한 뒷 큰수들을 차례로 담은 배열을 return
 ( 단, 뒷 큰수가 존재하지 않는 원소는 -1을 담습니다. )


 */
public class FindTheNextBigNumber {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        int index;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numbers.length; i++) {
            index = i - 1;
            while (!stack.empty() && stack.peek() < numbers[i]) {
                if(answer[index] == -1){
                    stack.pop();
                    answer[index] = numbers[i];
                }
                index--;
            }
            stack.push(numbers[i]);
        }
        return answer;
    }
}
