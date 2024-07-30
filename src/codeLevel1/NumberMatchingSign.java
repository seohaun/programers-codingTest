package codeLevel1;

import java.util.HashMap;
import java.util.Map;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/131128
 숫자 짝꿍
 - 두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다).
 - X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.

 1. 두 숫자 비교해서 공통 숫자 추출하고 내림차순 정렬하는 로직으로 개발 -> 실패 ( X.toCharArray O(n) x Y.contains가 시간이 오래 걸린것같음.
 2. Map을 사용해서 X, Y 각각 Key = 0~9 / value = 중복되는 숫자 count
    compareNumCnt라는 Map으로  Key = 0~9 / value = X,Y 비교하여 더 적은 수( 공통으로 나타나는 정수 ) 저장
    큰 숫자부터 answer에 저장, 모든숫자가 0으로 되어있을때는 "0" 으로 변경
 */
public class NumberMatchingSign {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        Map<Integer, Integer> xNumCnt = new HashMap<>();
        Map<Integer, Integer> yNumCnt = new HashMap<>();
        Map<Integer, Integer> compareNumCnt = new HashMap<>();
        for (char xChr : X.toCharArray()) {
            xNumCnt.merge(Integer.parseInt(xChr + ""), 1, Integer::sum);
        }
        for (char yChr : Y.toCharArray()) {
            yNumCnt.merge(Integer.parseInt(yChr + ""), 1, Integer::sum);
        }
        for (int i = 0; i < 10; i++) {
            compareNumCnt.put(i, Math.min(xNumCnt.getOrDefault(i, 0), yNumCnt.getOrDefault(i, 0)));
        }
        Integer[] keysToCheck = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        for (Integer key : keysToCheck) {
            Integer value = compareNumCnt.get(key);
            if (value != 0) {
                answer.append((key + "").repeat(value));
            }
        }
        if (answer.toString().matches("0+")) {
            answer = new StringBuilder("0");
        }
        return answer.toString().equals("") ? "-1" : answer.toString();
    }
}
