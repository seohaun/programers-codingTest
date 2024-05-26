package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120834
 외계행성의 나이
 - 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
 - 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. a는 0, b는 1, c는 2, ..., j는 9입니다.
 - 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.

 배열에 a~j까지 순서대로 넣고 사용하는 방법이 간결하고 좋아보임.
 String[] arr = {"a","b","c","d","e","f","g","h","i","j","k"};
        String answer = "";
        for(char c : ageStr.toCharArray()) {
            answer += arr[c-'0'];
        }
 */
public class AgeOfExoplanets {
    public static void main(String[] args) {

        String solution = solution(23);
        if ("cd".equals(solution)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static String solution(int age) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<String.valueOf(age).length(); i++){
            answer.append(switch (String.valueOf(age).substring(i, i + 1)) {
                case "0" -> "a";
                case "1" -> "b";
                case "2" -> "c";
                case "3" -> "d";
                case "4" -> "e";
                case "5" -> "f";
                case "6" -> "g";
                case "7" -> "h";
                case "8" -> "i";
                case "9" -> "j";
                default -> "";
            });
        }
        return answer.toString();
    }
}
