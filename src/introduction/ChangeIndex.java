package introduction;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120895
 인덱스 바꾸기
 - 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.

 */
public class ChangeIndex {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder(my_string);
        char temp = answer.charAt(num1);
        answer.setCharAt(num1, answer.charAt(num2));
        answer.setCharAt(num2, temp);
        return answer.toString();
    }
}
