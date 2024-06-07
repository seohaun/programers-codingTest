package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120850
 문자열 정렬하기1
 - 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

 String 에 대해서 문자들 replace 하고 sort 하는게 이해가 더 쉬운거 같음.
 stream 으로 한줄로 가능....
 */
public class SortingStrings1 {
    public static void main(String[] args) {
        int[] resultValue = {1, 2, 2, 3, 9};

        int[] solution = solution("hi12392");
        if (Arrays.equals(solution, resultValue)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int[] solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        for(char chr : my_string.toCharArray()){
            if (Character.isDigit(chr)) answer.add(Character.getNumericValue(chr));
        }
        Collections.sort(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
        //return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}
