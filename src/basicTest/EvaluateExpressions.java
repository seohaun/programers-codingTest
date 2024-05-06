package basicTest;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/181865
 간단한 식 계산하기
 - 문자열 binomial이 매개변수로 주어집니다. binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다.
 - 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
 제한사항
 - 0 ≤ a, b ≤ 40,000
 - 0을 제외하고 a, b는 0으로 시작하지 않습니다.
 입출력 예
 - binomial	        result
 - "43 + 12"	    55
 - "0 - 7777"	    -7777
 - "40000 * 40000"	1600000000
 */
public class EvaluateExpressions {
    public static void main(String[] args) {

        int solution = solution("43 + 12");
        if (55 == solution) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int solution(String binomial) {
        int answer;
        String[] temp = binomial.split(" ");
        answer = switch (temp[1]) {
            case "+" -> Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]);
            case "-" -> Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]);
            case "*" -> Integer.parseInt(temp[0]) * Integer.parseInt(temp[2]);
            default -> 0;
        };
        return answer;
    }
}
