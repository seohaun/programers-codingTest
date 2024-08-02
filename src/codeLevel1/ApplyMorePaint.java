package codeLevel1;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/161989
 덧칠하기
 페인트가 칠해진 길이 n, 벽에 페인트를 칠하는 롤러의 길이는 m,  다시 페인트를 칠하기로 정한 구역들의 번호가 담긴 정수 배열 section
 페인트를 롤러로 칠해야 하는 최소 횟수를 return

 paintingRangeStart 변수에 section[0] + m(롤러의 길이) 초기화
 section 배열 반복해서 section의 다음 숫자와 paintingRangeStart 비교해서 더 크거나 같다면 paintingRangeStart값을 바꾸고 answer에 +1을 더하는 로직으로 작성
 다른
 */
public class ApplyMorePaint {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int paintingRangeStart = section[0]+m;
        for(int i = 1; i<section.length; i++){
            if(section[i] >= paintingRangeStart){
                paintingRangeStart = section[i]+m;
                answer++;
            }
        }
        return answer;
    }
}
