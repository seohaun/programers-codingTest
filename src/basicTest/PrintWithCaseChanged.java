package basicTest;

/*
 대소문자 바꿔서 출력하기
 - 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
 - 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
 제한사항
 - 1 ≤ str의 길이 ≤ 20
 - str은 알파벳으로 이루어진 문자열입니다.
 입출력 예
 - 입력 #1 : aBcDeFg
 - 출력 #1 : AbCdEfG
 */
public class PrintWithCaseChanged {
    public static void main(String[] args) {
        String[] arr = {"aBcDeFg"};
        String solution = solution(arr);
        if ("AbCdEfG".equals(solution)) {
            System.out.println("일치");
        } else {
            System.out.println("일치하지않음");
        }
    }

    public static String solution(String[] arr) {
        //Scanner sc = new Scanner(System.in);
        //String text = sc.nextLine();
        String text = arr[0];
        StringBuilder result = new StringBuilder(text.length());

        for (char word : text.toCharArray()) {
            if (Character.isUpperCase(word)) {
                result.append(Character.toLowerCase(word));
            }
            if (Character.isLowerCase(word)) {
                result.append(Character.toUpperCase(word));
            }
        }
        return result.toString();
    }
}
