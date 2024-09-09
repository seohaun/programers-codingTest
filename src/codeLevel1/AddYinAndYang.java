package codeLevel1;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/76501
 음양더하기
 - 어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
 - 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.

 absolutes 만큼 반복할때 초기값 0 에 sings[반복문index] 의 부호 계산

 다른사람들과 비슷한데 제일 좋은 사람의 방법은
 answer += absolutes[i] * (signs[i] ? 1 : -1);
 */
public class AddYinAndYang {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<absolutes.length; i++){
            answer = signs[i] ? answer + absolutes[i] : answer - absolutes[i];
        }
        return answer;
    }
}
