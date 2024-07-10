package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120866
 안전지대
 - 다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
 - 지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
 - 지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.

 2차원 배열 board를 전부 확인 하기 위해 2중 for문을 사용하고 지뢰가 있는지 확인하는 조건문 ( 위, 아래, 좌, 우, 모든 대각선 칸에 지뢰가 있는지 확인 )
 */
public class SafeZone {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i=0; i<board.length;i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == 0 && board[Math.min(i+1,board.length-1)][j] == 0 //확인기준 가운데, 오른쪽
                        && board[i][Math.min(j+1,board.length-1)] == 0 && board[Math.min(i+1,board.length-1)][Math.min(j+1,board.length-1)] == 0 //아래, 오른쪽 대각선 아래
                        && board[Math.max(i-1,0)][j] == 0 && board[i][Math.max(j-1,0)] == 0 && board[Math.max(i-1,0)][Math.max(j-1,0)] == 0 //위쪽, 왼쪽, 왼쪽 대각선 위
                        && board[Math.max(i-1,0)][Math.min(j+1,board.length-1)] == 0 && board[Math.min(i+1,board.length-1)][Math.max(j-1,0)] == 0) { // 오른쪽 대각선 위, 왼쪽 대각선 아래
                    answer++;
                }
            }
        }
        return answer;
    }
}
