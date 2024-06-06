package introduction;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120888
 중복된 문자 제거
 - 문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

 mapToObj(Character::toString) -> distinct() 함수가 있음!!!
 */
public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String solution = solution("people");
        if ("peol".equals(solution)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (char chr : my_string.toCharArray()) {
            if (answer.indexOf(String.valueOf(chr)) == -1) {
                answer.append(chr);
            }
        }
        return answer.toString();

        // return my_string.chars()
        //         .mapToObj(Character::toString)
        //         .distinct()
        //         .collect(Collectors.joining());
    }
}
