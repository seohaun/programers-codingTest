package codeLevel1;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/12926
 시저 암호
 - 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호
 - 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
 - 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.


 */
public class CaesarPassword {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for(char chr:s.toCharArray()){
            char shifted;
            if(chr == ' '){
                shifted = ' ';
            }else{
                char base = Character.isUpperCase(chr) ? 'A' : 'a';
                shifted = (char) (base + (chr - base + n) % 26);
            }
            answer.append(shifted);
        }
        return answer.toString();
    }
}
