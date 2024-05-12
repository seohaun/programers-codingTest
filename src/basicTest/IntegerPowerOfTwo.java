package basicTest;

import java.util.Arrays;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/181857
 배열의 길이를 2의 거듭제곱으로 만들기
 - 정수 배열 arr이 매개변수로 주어집니다.
 - arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
 - arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
 제한사항
 - 1 ≤ arr의 길이 ≤ 1,000
 - 1 ≤ arr의 원소 ≤ 1,000
 입출력 예
 - arr	                result
 - [1, 2, 3, 4, 5, 6]	[1, 2, 3, 4, 5, 6, 0, 0]
 - [58, 172, 746, 89]	[58, 172, 746, 89]
 ( 사실 훨씬 더 어렵게 해결 했는데 더 간단한 방법이 있어서 가져옴.. )
 */
public class IntegerPowerOfTwo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] resultValue = {1, 2, 3, 4, 5, 6, 0, 0};

        int[] solution = solution(arr);
        if (Arrays.equals(solution, resultValue)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int[] solution(int[] arr) {
        int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    }
}
