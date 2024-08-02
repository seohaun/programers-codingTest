package codeLevel1;

import java.util.Arrays;
import java.util.Collections;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/131128
 숫자 짝꿍
 - 두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다).
 - X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.

 두 숫자 비교해서 공통 숫자 추출하고 내림차순 정렬하는 로직으로 개발
 */
public class NumberMatchingSign_실패 {
    public String solution(String X, String Y) {
        String answer = "";
        for(char xChr:X.toCharArray()){
            if(Y.contains(xChr+"")){
                Y = Y.replaceFirst(xChr+"","");
                answer += xChr;
            }
        }
        Character[] charArray = new Character[answer.length()];
        for (int i = 0; i < answer.length(); i++) {
            charArray[i] = answer.charAt(i);
        }
        Arrays.sort(charArray, Collections.reverseOrder());
        StringBuilder sortedString = new StringBuilder(charArray.length);
        for (Character c : charArray) {
            sortedString.append(c.charValue());
        }

        return sortedString.toString() != "" ? sortedString.toString() : "-1";
    }
}
