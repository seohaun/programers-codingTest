package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120888
 중복된 문자 제거
 - 문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

 my_string을 char배열로 변환후 반복해서 char를 StriungBuilder answer에 (answer에 char가 없을때) 저장

 한줄로도 가능 ( 다른사람 풀이 확인 )
 return my_string.chars()
                 .mapToObj(Character::toString)
                 .distinct()
                 .collect(Collectors.joining());
 */
public class RemoveDuplicate {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (char chr : my_string.toCharArray()) {
            if (answer.indexOf(String.valueOf(chr)) == -1) {
                answer.append(chr);
            }
        }
        return answer.toString();
    }
}
