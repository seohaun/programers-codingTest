package codeLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/42840
 모의고사

    //1,2,3번 반복루틴 배열로 저장
    //answer 만큼 반복해서 1,2,3 맞춘 갯수 +1씩 증가
 */
public class MockExam {
        public int[] solution(int[] answers) {
            int[] mathGiveUp1 = {1, 2, 3, 4, 5};
            int[] mathGiveUp2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] mathGiveUp3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int[] scores = new int[3];
            int[][] patterns = {mathGiveUp1, mathGiveUp2, mathGiveUp3};
            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == patterns[0][i % patterns[0].length]) scores[0]++;
                if (answers[i] == patterns[1][i % patterns[1].length]) scores[1]++;
                if (answers[i] == patterns[2][i % patterns[2].length]) scores[2]++;
            }
            int maxScore = Arrays.stream(scores).max().orElse(0);
            List<Integer> answer = new ArrayList<>();
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] == maxScore) {
                    answer.add(i + 1);
                }
            }
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
}
