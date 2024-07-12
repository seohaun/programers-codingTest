package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120871
 저주의 숫자3
 - 3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.

 반복문을 돌려서 3의 배수이거나 숫자 3이 들어가면 다음숫자로 갈수있도록 로직 작성
 */
public class CurseNumber3 {
    public int solution(int n) {
        int answer = 0;
        for(int i=0; i<n; i++){
            answer++;
            while(answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }
        return answer;
    }
}
