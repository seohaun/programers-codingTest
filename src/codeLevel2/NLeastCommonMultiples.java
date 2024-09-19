package codeLevel2;

import java.util.HashMap;
import java.util.Map;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/12953
 N개의 최소공배수
 - n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수

 https://blog.naver.com/ptwshin/223101298169 에서 최소공배수를 구하는 원리 강의를 들었음 ( 알고리즘 확인 )
 최소공배수 구하는 알고리즘
 1. 3개의 숫자의 최소 공배수를 구할때 각각 1개씩 최소공약수를 구하기
 2. 각각의 숫자의 제곱들이 있으면 숫자들을 비교해서 같은 숫자라면 제곱의 숫자가 더 큰 숫자를 대표로.
 3. 대표들을 곱하면 최소 공배수
 ex) 108, 72, 96 일때
 1. 각각 최소공약수 구하기 - 108 : 2의2제곱 x 3의3제곱 / 72 : 2의3제곱 x 3의2제곱 / 96 : 2의5제곱 x 3의1제곱
 2. (제곱의 숫자가 더 큰)대표 숫자 고르기 - 2의 제곱은 최대 5 , 3의 제곱은 최대 3
 3. Math.pow(2,5)*Math.pow(3,3) 하면 108, 72, 96 숫자들의 최소 공배수.

 */
public class NLeastCommonMultiples {
    public int solution(int[] arr) {
        int answer = 1;
        Map<Integer,Integer> arrMap = new HashMap<>();
        for(int n:arr){
            Map <Integer,Integer> tempMap = new HashMap<>();
            while (n % 2 == 0) {
                tempMap.put(2,tempMap.getOrDefault(2, 0) + 1);
                n = n / 2;
            }
            for (var i = 3; i*i <= n; i = i + 2) {
                while (n % i == 0) {
                    tempMap.put(i,tempMap.getOrDefault(i, 0) + 1);
                    n = n / i;
                }
            }
            if (n > 2) {
                tempMap.put(n,tempMap.getOrDefault(n, 0) + 1);
            }
            for(Integer value:tempMap.keySet()){
                if(arrMap.getOrDefault(value, 0) < tempMap.get(value)) {
                    arrMap.put(value,tempMap.get(value));
                }
            }
        }
        for(Integer value:arrMap.keySet()){
            answer *= (int) Math.pow(value,arrMap.get(value));
        }
        return answer;
    }
}
