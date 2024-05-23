package introduction;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120825
 문자 반복 출력하기
 - 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.

 String 내장 함수( repeat 사용 )에 대해서 알면 간편하게 반복 가능
 */
public class PrintingRepeatedCharacters {
    public static void main(String[] args) {
        String solution = solution("hello", 3);
        if ("hhheeellllllooo".equals(solution)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for (char chr : my_string.toCharArray()) {
            String temp = chr + "";
            answer.append(temp.repeat(n));
        }
        return answer.toString();
    }
}
