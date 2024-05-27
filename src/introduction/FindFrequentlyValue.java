package introduction;

import java.util.Arrays;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120812
 최빈값 구하기
 자료구조 Map 으로 했으면 조금 더 편하게 했을것같음.

 */
public class FindFrequentlyValue {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4};

        int solution = solution(array);
        if (solution == 3) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }
    public static int solution (int[] array){
        int[] numCount = new int[array.length + 2];
        for (int num : array) {
            numCount[num]++;
        }
        int maxNumber = Arrays.stream(numCount).max().getAsInt();
        int count = 0;
        int maxIndex = 0;
        for (int i = 0; i < numCount.length; i++) {
            if (numCount[i] == maxNumber) {
                maxIndex = i;
                count++;
            }
        }
        return count > 1 ? -1 : maxIndex;
    }
}