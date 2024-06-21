package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120902
 문자열 계산하기
 - my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.

 한줄로도 가능..? return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum()
 */
public class ComputingStrings {
    public int solution(String my_string) {
        String[] parts = my_string.split(" \\+ | - ");
        String formula = my_string.replaceAll("\\b(?![+\\-])\\w+\\b", "").replaceAll("\\s+", "");
        int answer = Integer.parseInt(parts[0]);
        int index = 1;
        for(char temp : formula.toCharArray()){
            if(temp == '+') answer += Integer.parseInt(parts[index]);
            if(temp == '-') answer -= Integer.parseInt(parts[index]);
            index++;
        }
        return answer;
    }
}
