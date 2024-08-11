package codeLevel1;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/140108
 문자열 나누기
 - 문자열 s가 입력되었을 때 다음 규칙을 따라서 이 문자열을 여러 문자열로 분해
 - 먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
 - 이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서, x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다. 처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
 - s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복합니다. 남은 부분이 없다면 종료합니다.
 - 만약 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면, 역시 지금까지 읽은 문자열을 분리하고, 종료합니다.
 - 문자열 s가 매개변수로 주어질 때, 위 과정과 같이 문자열들로 분해하고, 분해한 문자열의 개수를 return

  s char만큼 반복
  시작 문자와 같은 수 count, 시작 문자와 다른 수 count
  두 수가 같으면 answer++ 하고 두 수 reset 하고 시작 문자 변경
  마지막 반복 일때 시작 문자와 같은 수 count와 시작 문자와 다른 수 count가 다르면 answer++
 */
public class SplitString {
    public int solution(String s) {
        int answer = 0;
        char[] sCharArray = s.toCharArray();
        char startChr = sCharArray[0];
        int startChrCnt = 0;
        int orderChrCnt = 0;
        for(int i=0; i<sCharArray.length;i++){
            if(startChr == sCharArray[i]){
                startChrCnt++;
            }else{
                orderChrCnt++;
            }
            if(startChrCnt != 0 && startChrCnt == orderChrCnt){
                startChr = sCharArray[Math.min(i+1,sCharArray.length-1)];
                startChrCnt = 0;
                orderChrCnt = 0;
                answer++;
            }
            if(i == sCharArray.length-1 && startChrCnt != orderChrCnt){
                answer++;
            }
        }
        return answer;
    }
}
