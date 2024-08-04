package codeLevel1;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/12903
 가운데 글자 가져오기
 - 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

 substring을 사용하여 문자열 가운데 추출 하도록 로직 작성
 */
public class GetMiddleLetter {
    public String solution(String s) {
        int startIdx = s.length()/2-1;
        if(s.length()%2 != 0) startIdx += 1;
        return s.substring(startIdx, s.length()/2+1);
    }
}
