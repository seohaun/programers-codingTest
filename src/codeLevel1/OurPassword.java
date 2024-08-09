package codeLevel1;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/155652
 둘만의 암호
 - 문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줍니다. index만큼의 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아갑니다. skip에 있는 알파벳은 제외하고 건너뜁니다.
 - 두 문자열 s와 skip, 그리고 자연수 index가 매개변수로 주어질 때 위 규칙대로 s를 변환한 결과를 return

 문자열 s를 문자 하나씩 꺼내서 반복문.
 문자를 index만큼 뒤에 숫자로 변환.(skip과 일치하는 단어가 있다면 +1, z넘어갈 경우 다시 a로)
 97(a)~122(z)
 */
public class OurPassword {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        for(char chr:s.toCharArray()){
            int indexTemp = index;
            char charTemp = chr;
            while(indexTemp-- > 0){
                charTemp = (char)(charTemp + 1);
                if(charTemp > 122) charTemp = 97;
                if(skip.contains(charTemp+"")){
                    indexTemp++;
                }
            }
            answer.append(charTemp);
        }
        return answer.toString();
    }
}
