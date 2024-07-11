package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/12916
 문자열 내 p와 y의 개수
 -  대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
 - 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 - 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

 stream 사용해서 풀어보고싶어서 s를 모두 소문자로 바꾸고 filter를 사용해서 p, y 숫자 count 하는 방법으로 구현
 */
public class NumberPAndY {
    public boolean solution(String s) {
        long countP = s.toLowerCase().chars()
                .filter(ch -> ch == 'p')
                .count();
        long countY = s.toLowerCase().chars()
                .filter(ch -> ch == 'y')
                .count();
        System.out.println(s);
        return countP == countY;
    }
}
