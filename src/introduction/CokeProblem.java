package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/132267
 콜라 문제
 - 오래전 유행했던 콜라 문제가 있습니다. 콜라 문제의 지문은 다음과 같습니다.
 정답은 아무에게도 말하지 마세요.
 콜라 빈 병 2개를 가져다주면 콜라 1병을 주는 마트가 있다. 빈 병 20개를 가져다주면 몇 병을 받을 수 있는가?
 단, 보유 중인 빈 병이 2개 미만이면, 콜라를 받을 수 없다.
 a	 b	 n	 result
 2	 1	 20	 19
 3	 1	 20	 9

 빈 콜라 n병을 가지고 있을 때 어떤 마트에서는 a병(갯수) 만큼 반납하면 b병(갯수) 을 준다고 할 때 이걸 일반화 시키는 문제.

 n이 a의 갯수보다 클때까지 반복하는 조건의 while문 생성
 n/a * b를 해서 반납시 받을수있는 병의 갯수를 answer에 저장하고 반납 후 남은 병+반납해서 받은병의 갯수는 n값으로 저장
 */
public class CokeProblem {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            answer += n/a * b;
            n =  (n/a * b) + n % a;
        }
        return answer;
    }
}
