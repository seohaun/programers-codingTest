package codeLevel1;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/12934?language=java
 정수 제곱근 판별
 - 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 - n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요

 제곱근을 구해주는 Math.sqrt 함수 사용해서 해결

 */
public class DetermineSquareRoot {
    public long solution(long n) {
        long answer = -1;
        double sqrtValue = Math.sqrt(n);
        long sqrtAsLong = (long) sqrtValue;
        if(sqrtValue == sqrtAsLong) answer = (long)Math.pow(sqrtValue+1,2);
        return answer;
    }
}
