package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/136798
 기사단원의 무기
 - 숫자나라 기사단의 각 기사에게는 1번부터 number까지 번호가 지정되어 있습니다. 기사들은 무기점에서 무기를 구매하려고 합니다.

 너무 간단..
 */
public class TemplarWeapon {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        int[] divisorCounts = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisorCounts[j]++;
            }
            if(divisorCounts[i] > limit){
                divisorCounts[i] = power;
            }
            answer += divisorCounts[i];
        }

        return answer;
    }
}
