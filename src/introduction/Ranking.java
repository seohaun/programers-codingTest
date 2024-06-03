package introduction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120882
 등수 매기기
 - 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
 - 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.

 평균 점수 배열을 먼저 만들고나서 등수를 매기는 방법으로 코딩을 함.

 */
public class Ranking {
    public static void main(String[] args) {
        //int[][] num_list = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        //int[] resultValue = {4, 4, 6, 2, 2, 1, 7};
        int[][] num_list = {{1, 3}, {3, 1}, {2, 3}, {3, 2}, {1, 2}, {1, 1}};
        int[] resultValue = {3, 3, 1, 1, 5, 6};

        int[] solution = solution(num_list);
        if (Arrays.equals(solution, resultValue)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int[] solution(int[][] score) {
        double[] scoreArray = new double[score.length];
        for (int i = 0; i < score.length; i++) {
            scoreArray[i] = (double)(score[i][0] + score[i][1]) / 2;
        }
        double[] sortedArray = Arrays.copyOf(scoreArray, scoreArray.length);

        Arrays.sort(sortedArray);

        Map<Double, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int i = sortedArray.length - 1; i >= 0; i--) {
            if (!rankMap.containsKey(sortedArray[i])) {
                rankMap.put(sortedArray[i], rank);
            }
            rank += 1;
        }

        int[] answer = new int[scoreArray.length];
        for (int i = 0; i < scoreArray.length; i++) {
            answer[i] = rankMap.get(scoreArray[i]);
        }
        return answer;
    }
}
