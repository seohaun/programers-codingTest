package introduction;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120851
 숨어있는 숫자의 덧셈
 - 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

 gpt의 도움을 받아서 간결한 코딩 완료! 람다식 goood
 */
public class AdditionOfHiddenNumbers {
    public static void main(String[] args) {

        int solution = solution("aAb1B2cC34oOp");
        if (solution == 10) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int solution(String my_string) {
        return my_string.replaceAll("[^0-9]", "").chars().map(c -> c - '0').sum();
    }
}
