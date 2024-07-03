package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120878
 유한소수 판별하기
 - 소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다. 분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다. 유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
 - 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
 - 두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.

 먼저 분자,분모의 최대공약수를 구해서 그 값으로 분모를 나누는 함수 작성, 다음으로 기약분수의 분모의 소인수가 2,5만 존재하는지 확인하는 함수 작성
 */
public class DeterminingFiniteDecimalNumbers {
    public int solution(int a, int b) {
        int gcd = gcd(a, b);
        b /= gcd;
        return isFactorTwoAndFive(b);
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int isFactorTwoAndFive(int number) {
        while (number % 2 == 0) {
            number /= 2;
        }
        while (number % 5 == 0) {
            number /= 5;
        }
        return number == 1 ? 1 : 2;
    }
}
