package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120903
 배열의 유사도
 - 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.

   자료구조 Set을 사용하면 훨씬 더 간단하게 해결.
    Set<String> set = new HashSet<>(Arrays.asList(s1));
    return (int)Arrays.stream(s2).filter(set::contains).count();
 */
public class SimilarityOfArrays {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> list = new ArrayList<>(Arrays.asList(s2));
        for(String temp : s1){
            if(list.contains(temp)) answer++;
        }
        return answer;
    }
}
