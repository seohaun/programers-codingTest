package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/172928
 공원 산책
 - 지나다니는 길을 'O', 장애물을 'X'로 나타낸 직사각형 격자 모양의 공원에서 로봇 강아지가 산책을 하려합니다. 산책은 로봇 강아지에 미리 입력된 명령에 따라 진행하며, 명령은 다음과 같은 형식으로 주어집니다.
 // park	                    routes	                    result
 //["OSO","OOO","OXO","OOO"]	["E 2","S 3","W 1"]	        [0,0]
 시작 "S" 의 위치를 먼저 구하고 routes 만큼 이동( 가능한지 불가능 한지 체크 후에 이동 ) 하는 로직으로 작성
 */
public class WalkInThePark {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        for(int i=0; i<park.length; i++){
            if(park[i].contains("S")){
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
            }
        }
        for (String route : routes) {
            String[] parts = route.split(" ");
            int moveCount = Integer.parseInt(parts[1]);
            String tempString;
            boolean isMoveOk = true;
            switch (parts[0]) {
                case "N":
                    if (answer[0] >= moveCount) {
                        for (int a = 1; a <= moveCount; a++) {
                            if ("X".equals(String.valueOf(park[answer[0] - a].charAt(answer[1])))) {
                                isMoveOk = false;
                                break;
                            }
                        }
                        if (isMoveOk) answer[0] -= moveCount;
                    }
                    break;
                case "S":
                    if (park.length - answer[0] > moveCount) {
                        for (int a = 1; a <= moveCount; a++) {
                            if ("X".equals(String.valueOf(park[answer[0] + a].charAt(answer[1])))) {
                                isMoveOk = false;
                                break;
                            }
                        }
                        if (isMoveOk) answer[0] += moveCount;
                    }
                    break;
                case "W":
                    if (answer[1] >= moveCount) {
                        tempString = park[answer[0]].substring(Math.max(answer[1] - moveCount, 0), answer[1]);
                        if (!tempString.contains("X")) answer[1] -= moveCount;
                    }
                    break;
                case "E":
                    if (park[0].length() - answer[1] > moveCount) {
                        tempString = park[answer[0]].substring(answer[1] + 1, Math.min(answer[1] + 1 + moveCount, park[answer[0]].length()));
                        if (!tempString.contains("X")) answer[1] += moveCount;
                    }
                    break;
                default:
                    break;
            }
        }
        return answer;
    }
}
