package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120860
 직사각형 넓이 구하기
 - 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
 - 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.

 가로,세로 크기 찾아서 나온값 2가지 값을 곱하는 로직으로 작성
 첫번째 index 에 x1 좌표와 같은 값을 찾고 같은 값에 y1과 y?를 비교하여 가로? 값 구하기, y좌표와 같은 값을 찾고 2개 index의 x값을 비교하여 세로? 값 찾기 ( 가로 세로가 바뀔수도 있을 듯 하지만 지금 코딩테스트 문제에서는 상관이 없을듯 )
 */
public class FindAreaRectangle {
    public int solution(int[][] dots) {
        int width = 0;
        int height = 0;
        for(int i=1; i< dots.length; i++){
            if(dots[0][0] == dots[i][0]){
                width = Math.abs(dots[0][1] - dots[i][1]);
            }
            if(dots[0][1] == dots[i][1]){
                height = Math.abs(dots[0][0] - dots[i][0]);
            }
        }
        return width*height;
    }
}
