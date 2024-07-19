package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/12922
 수박수박수박
 -길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

 String 의 repeat 메소드 사용해서 해결
 */
public class Watermelon {
    public String solution(int n) {
        String word = "수박".repeat(n/2);
        return n % 2 == 0 ? word : word+"수";
    }
}
