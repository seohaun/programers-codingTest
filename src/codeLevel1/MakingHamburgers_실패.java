package codeLevel1;

import java.util.ArrayList;
import java.util.List;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/133502
 햄버거 만들기

 ingredient 에는 1,2,3 ( 1: 빵, 2: 야채, 3: 고기 ) 가 랜덤으로 나열이 됨. 이때 1,2,3,1 ( 빵,야채,고기,빵 ) 순서가 있다면 햄버거를 1개 만들수 있음. 햄버거를 몇개 만들 수 있는지 반환.

 ingredient 전체에서 1,2,3,1이 있는지 확인하고 있으면 ingredient 배열에서 1,2,3,1이 시작한 index전의 배열 + index+4 의 배열을 합쳐서 다시 1,2,3,1이 있는지 확인 하는 로직으로 작성
 */
public class MakingHamburgers_실패 {
    public int solution(int[] ingredient) {
        int answer = 0;
        int startIdx = 0;
        while (true){
            startIdx = containsSequence(ingredient, startIdx);
            if(startIdx == -1) break;
            answer++;
            ingredient = removeSequence(ingredient, startIdx);
        }
        return answer;
    }
    public static int containsSequence(int[] ingredient, int startIdx){
        int[] sequence = {1,2,3,1};
        boolean result;
        for (int i = startIdx; i <= ingredient.length-sequence.length; i++){
            result = true;
            for (int j = 0; j < sequence.length; j++) {
                if (ingredient[i+j] != sequence[j]) {
                    result = false;
                    break;
                }
            }
            if(result) return i > 0 ? i-1 : i;
        }
        return -1;
    }
    public static int[] removeSequence(int[] ingredient, int start) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < start; i++) {
            list.add(ingredient[i]);
        }
        for (int i = start + 4; i < ingredient.length; i++) {
            list.add(ingredient[i]);
        }
        int[] resultArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resultArray[i] = list.get(i);
        }
        return resultArray;
    }
}
