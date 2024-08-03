package codeLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/42862
 체육복
 - 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

 1.배열 2개 정렬
 2.중복 제거
 3.배열 2중 for문 ( 배열 2개가 최대 30개까지라서 2중 for문 사용 )
 4.(전체 학생의 수 - 도난당한 학생수) + 체육복을 빌린 학생수 (lostSort == -1인 값들)

 다른 사람풀이
 1. int answer = n; people이라는 배열(size = n)을 만들고 people[lost]-- , people[reserve]++ 초기화
 2. people 반복문안에 조건 1. (i-1>=0 && people[i-1] == 1) 일때 people[i]++; people[i-1]--; / 조건 2.(i+1< people.length && people[i+1] == 1) people[i]++; people[i-1]--; / 그게 아니면 answer--;
 */
public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        ArrayList<Integer> lostSort = (ArrayList<Integer>) IntStream.of(lost).boxed().collect(Collectors.toList());
        ArrayList<Integer> reserveSort = (ArrayList<Integer>) IntStream.of(reserve).boxed().collect(Collectors.toList());
        ArrayList<Integer> intersection = new ArrayList<>(lostSort);
        intersection.retainAll(reserveSort);
        lostSort.removeAll(intersection);
        reserveSort.removeAll(intersection);

        if(lostSort.size() > 0){
            for(int i=0; i<lostSort.size(); i++){
                for(int j=0; j<reserveSort.size(); j++){
                    int extraStudentNum = reserveSort.get(j);
                    if(extraStudentNum == -1) continue;
                    if(lostSort.get(i) == extraStudentNum-1 || lostSort.get(i) == extraStudentNum+1){
                        lostSort.set(i, -1);
                        reserveSort.set(j, -1);
                        break;
                    }
                }
            }
        }

        answer = n - lostSort.size();
        for(int num : lostSort){
            if(num == -1) answer++;
        }
        return answer;
    }
}
