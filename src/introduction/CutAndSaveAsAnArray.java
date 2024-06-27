package introduction;

import java.util.ArrayList;
import java.util.List;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120913
 짤라서 배열로 저장
 - 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

 문자열을 n씩 짤라서 List에 넣는 작업을 반복하는 로직으로 작성
 */
public class CutAndSaveAsAnArray {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < my_str.length(); i += n) {
            answer.add(my_str.substring(i, Math.min(i + n, my_str.length())));
        }
        return answer.toArray(new String[0]);
    }
}
