package introduction;

import java.util.Arrays;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120808
 분수의 덧셈
 - 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
 - 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 제한사항
 - 0 <numer1, denom1, numer2, denom2 < 1,000

 최소공약수, 공배수를 이용
 */
public class AdditionOfFractions {
    public static void main(String[] args) {
        int[] resultValue = {5, 4};

        int[] solution = solution(1, 2, 3, 4);
        if (Arrays.equals(solution, resultValue)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int gcd = gcd(numer, denom);

        numer /= gcd;
        denom /= gcd;

        return new int[]{numer, denom};
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
