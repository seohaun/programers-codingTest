package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120921
 문자열 밀기
 - 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
 - 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고
   밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

 A,B 일치하면 0 리턴, 오른쪽으로 밀고 count return 일치하는게 없으면 -1 방법으로 코딩
 --> 더 좋은 방법은 A문자 2번 반복 후에 B의 indexOf ( return (B+B).indexOf(A); )
 */
public class StringPush {
    public static void main(String[] args) {
        int solution = solution("hello", "ohell");
        if (solution == 1) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int solution(String A, String B) {
        String Temp;
        int answer = -1;
        if(A.equals(B)) return 0;
        for(int i=1; i<B.length(); i++){
            Temp = B.substring(i) + B.substring(0, i);
            if(A.equals(Temp)){
                answer = i;
                break;
            }
        }
        return answer;

        //return (B+B).indexOf(A);
    }
}
