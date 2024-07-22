package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/12919?language=java
 서울에서 김서방 찾기
 - String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
 - seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

 Stream을 사용해서 해결해보고싶은 마음에 Stream 사용해서 seoul 배열에서 Kim의 index를 찾은 방법으로 로직 작성 ( GPT도움을 받음.. OptionalInt(null값일수도 있는 .. )를 처음 사용해봄 )
 */
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindKimInSeoul {
    public String solution(String[] seoul) {
        String answer = "";
        OptionalInt index = IntStream.range(0, seoul.length)
                .filter(i -> "Kim".equals(seoul[i]))
                .findFirst();

        if (index.orElse(0) != 0) {
            answer = "김서방은 "+index.getAsInt()+"에 있다";
        }
        return answer;
    }
}
