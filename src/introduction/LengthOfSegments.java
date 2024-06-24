package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120876
 겹치는 선분의 길이
 - 선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
 - Lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.

 점을 기준으로 Arr[j]++ 를 하는게 아니고 선을 기준으로 +1 했음 ( 0부터 1까지의 라인을 0이라고 네이밍, 1부터 2까지의 라인을 1이라고 네이밍 ) 그렇게 첫 셋팅을 하고나서 Arr 배열에서 2이상으로 겹치는게 있는선의 갯수 반환.
 */
public class LengthOfSegments {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[201];

        for (int[] line : lines) {
            for (int j = line[0] + 101; j < line[1] + 101; j++) {
                arr[j]++;
            }
        }

        for (int j : arr) {
            if (j >= 2) answer++;
        }

        return answer;
    }
}
