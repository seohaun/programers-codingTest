package introduction;

import java.util.HashMap;
import java.util.Map;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/118666
 성격 유형 검사하기
 - 나만의 카카오 성격 유형 검사지를 만들려고 합니다.
 - 성격 유형 검사는 다음과 같은 4개 지표로 성격 유형을 구분합니다. 성격은 각 지표에서 두 유형 중 하나로 결정됩니다.
 지표 번호	성격 유형
 1번 지표	    라이언형(R), 튜브형(T)
 2번 지표	    콘형(C), 프로도형(F)
 3번 지표	    제이지형(J), 무지형(M)
 4번 지표	    어피치형(A), 네오형(N)

 HashMap 사용해서 지표 survey 만큼 반복하고 choice 점수 중간인 4점을 기준으로 survey앞/뒤 문자에 점수 추가.
 지표 4가지 순서대로 String 배열에 담고 배열 반복문을 만들어 HashMap에서 점수를 가져와서 더 높은 점수를 해당 지표의 대표 성격유형으로 선택
 */
public class TestYourPersonalityType {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        Map<String,Integer> personalityScoreList = new HashMap<>();
        for(int i = 0; i< survey.length; i++){
            String scorekey = (choices[i] < 4) ? survey[i].substring(0, 1) : survey[i].substring(1, 2);
            int scoreChange = (choices[i] < 4) ? (4 - choices[i]) : (choices[i] - 4);
            personalityScoreList.merge(scorekey, scoreChange, Integer::sum);
        }
        //지표 4개 비교
        String[] temp = new String[4];
        temp[0] = "RT";
        temp[1] = "CF";
        temp[2] = "JM";
        temp[3] = "AN";
        for(int j=0; j<4; j++){
            int first = personalityScoreList.getOrDefault(temp[j].substring(0,1), 0);
            int second = personalityScoreList.getOrDefault(temp[j].substring(1,2), 0);
            answer.append(first >= second ? temp[j].substring(0, 1) : temp[j].substring(1, 2));
        }
        return answer.toString();
    }
}
