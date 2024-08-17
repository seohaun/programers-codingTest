package codeLevel2;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/12951
 JadenCase 문자열 만들기
 - JadenCase란 모든 단어의 첫 문자가 대문자, 그 외의 알파벳은 소문자인 문자열
 - 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다.

 1. 문자열을 모두 소문자로 변환 후 split 기준은 ( " " )
 2. 길이가 0 이상일때 첫번째 글자는 대문자, 나머지 글자 append
 3. s의 마지막 문자들이 공백일 때 처리를 위해서 s와 answer의 문자열 길이 비교 후 차이만큼 " "을 넣어줌

 다른사람들
 - Matcher m = Pattern.compile("\\b([\\w])([\\w]*)").matcher(s) 사용해서 해결
 - .split("")해서 문자를 1개씩 split하고 반복문 조건 안에 공백(" ") 찾아서 대문자 변환
 */
public class CreatingAJadenCaseString {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        for (String sSplit : s.toLowerCase().split(" ")) {
            if (sSplit.length() > 0) {
                answer.append(sSplit.substring(0, 1).toUpperCase());
                answer.append(sSplit.substring(1));
            }
            answer.append(" ");
        }
        int difference = s.length() - answer.substring(0, answer.length() - 1).length();

        return answer.substring(0, answer.length() - 1) + " ".repeat(difference);
    }
}
