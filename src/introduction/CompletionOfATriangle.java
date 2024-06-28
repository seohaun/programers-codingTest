package introduction;

import java.util.HashSet;
import java.util.Set;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120868
 삼각형의 완성조건2
 - 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
 - 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
 - 삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.

 2가지 계산 1. 두정수중에 최대값이 있을경우 계산 2. 다른 특정 값이 최대값일 경우
 */
public class CompletionOfATriangle {
    public int solution(int[] sides) {
        Set<Integer> numbersSet = new HashSet<>();
        for(int i=Math.abs(sides[0]-sides[1])+1; i<Math.max(sides[0],sides[1]); i++){
            if(i > Math.abs(sides[0]-sides[1])) numbersSet.add(i);
        }
        for(int j=Math.max(sides[0],sides[1]); j<sides[0]+sides[1]; j++){
            numbersSet.add(j);
        }
        return numbersSet.size();
    }
}
