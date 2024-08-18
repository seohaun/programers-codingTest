package codeLevel2;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/42860
 조이스틱
 (탐욕법 알고리즘)

 - 다른 사람의 힌트 참고했음. ( https://school.programmers.co.kr/questions/51275 )
 정방향으로 먼저 탐색 후 역방향으로 탐색하는 경우
 => Math.min(move, i * 2 + name.length() - contectAIdx);
 역방향으로 먼저 탐색 후 정방향으로 탐색하는 경우 두 경우에 대해 좌, 우 이동 횟수를 구하면서 최적해를 탐색하시면 됩니다.
 => Math.min(move, (name.length() - contectAIdx) * 2 + i);

 */
public class Joystick {
    public int solution(String name) {
        int answer = 0;
        int move = name.length() - 1;
        for(int i=0; i<name.length(); i++){
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1); //문자 클릭수 계산

            int contectAIdx = i+1;
            while(contectAIdx < name.length() && name.charAt(contectAIdx) == 'A'){
                contectAIdx++;
            }
            move = Math.min(move, i * 2 + name.length() - contectAIdx);
            move = Math.min(move, (name.length() - contectAIdx) * 2 + i);
        }

        return answer+move;
    }
}
