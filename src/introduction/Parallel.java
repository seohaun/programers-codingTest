package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120875
 평행
 - 점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
 - 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.

 바로 로직 작성하지 말고 문제를 읽고 메모장에 어떤식으로 로직을 만들지 적고 나서 로직을 만드니까 평소 보다 훨씬 빠르게 문제 해결. 코드 정리(리펙토링)는 GPT의 도움을 받음.. ( 파일럿 프로젝트 선생님 권순명님이 알려주신대로 하기 )
 배열 순서대로 평행 case는 1,2 <-> 3,4 / 1,3 <-> 2,4 / 1,4 <-> 2,3  ==> 총 3가지 case에 대해서 비교
 */
public class Parallel {
    public int solution(int[][] dots) {

        if ((dots[1][1] - dots[0][1]) * (dots[3][0] - dots[2][0]) == (dots[3][1] - dots[2][1]) * (dots[1][0] - dots[0][0])) return 1;
        if ((dots[2][1] - dots[0][1]) * (dots[3][0] - dots[1][0]) == (dots[3][1] - dots[1][1]) * (dots[2][0] - dots[0][0])) return 1;
        if ((dots[3][1] - dots[0][1]) * (dots[2][0] - dots[1][0]) == (dots[2][1] - dots[1][1]) * (dots[3][0] - dots[0][0])) return 1;

        return 0;
    }
}
