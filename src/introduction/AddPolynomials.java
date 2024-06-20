package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120863
 다항식 더하기
 - 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
 - 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요. 같은 식이라면 가장 짧은 수식을 return 합니다.
 */
public class AddPolynomials {
    public String solution(String polynomial) {
        StringBuilder answer = new StringBuilder();
        int xSum = 0;
        int numSum = 0;
        for(String temp : polynomial.split(" \\+ ")){
            temp = temp.trim();
            if(temp.contains("x")){
                xSum += (temp.length() == 1) ? 1 : Integer.parseInt(temp.replace("x", ""));
            }else{
                numSum += Integer.parseInt(temp);
            }
        }
        if (xSum > 0) answer.append(xSum == 1 ? "x" : xSum + "x");
        if (numSum > 0) {
            if (answer.length() > 0) answer.append(" + ");
            answer.append(numSum);
        }

        return answer.toString();
    }
}
