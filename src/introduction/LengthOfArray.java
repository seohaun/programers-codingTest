package introduction;

import java.util.Arrays;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120854
 배열 원소의 길이

 내가 생각한 로직으로 풀어보고 stream이 가능할지 생각해보기..
 Arrays.stream(strList).mapToInt(String::length).toArray();
 */
public class LengthOfArray {
    public static void main(String[] args) {
        String[] spell = {"We", "are", "the", "world!"};
        int[] resultValue = {2, 3, 3, 6};

        int[] solution = solution(spell);
        if (Arrays.equals(solution, resultValue)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int index = 0;
        for(String str:strlist){
            answer[index] = str.length();
            index++;
        }
        return answer;
        //Arrays.stream(strList).mapToInt(String::length).toArray();
    }
}
