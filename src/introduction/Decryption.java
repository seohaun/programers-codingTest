package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120892
 암호 해독
 - 군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
 - 암호화된 문자열 cipher를 주고받습니다.
 - 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
 - 문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.

 꼭 스트림으로 하고 싶어서 여기저기 검색 + GPT의 도움을 받아서 완성
 */
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Decryption {
    public String solution(String cipher, int code) {
        return IntStream.range(0, cipher.length())
                .filter(i -> i % code == code - 1)
                .mapToObj(i -> String.valueOf(cipher.charAt(i)))
                .collect(Collectors.joining());
    }
}
