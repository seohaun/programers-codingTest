package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120886
 A로 B만들기
 - 문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

 문자열 before의 char 하나씩 반복문을 돌려 after에 있는 char 하나만 ""로 치환하여 반복문 종료후에 after의 크기가 0보다 크면 0 작으면 1을 반환하는 로직
 */
public class MakeBWithA {
    public int solution(String before, String after) {
        for(char chr : before.toCharArray()){
            after = after.replaceFirst(String.valueOf(chr), "");
        }
        return after.length() > 0 ? 0 : 1;
    }
}
