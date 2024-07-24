package introduction;

import java.util.Arrays;
import java.util.Collections;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/135808
 사과장수
 - 과일 장수가 사과 상자를 포장하고 있습니다. 사과는 상태에 따라 1점부터 k점까지의 점수로 분류하며, k점이 최상품의 사과이고 1점이 최하품의 사과입니다. 사과 한 상자의 가격은 다음과 같이 결정됩니다.
 상태 따라 점수가 매겨진 사과들이 score에 들어있을때 m개씩 1박스에 담을수 있다.
 1박스의 가격은 m개 담겨진 사과의 최소 점수 * 사과의 갯수이다.
 과일장수가 사과를 박스 단위로만 판매 할수 있을때 얻을 수 있는 최대 이익은 ?

 우선 score를 내림 차순 정렬을 해서 점수가 높은 사과들을 m으로 나눠서 높은 가격을 얻을 수 있도록 로직 작성

 다른 사람들은 내림차순 정렬까지 하지 않고 오름 차순 정렬까지 하고 계산하는 로직 작성
 */
public class AppleSeller {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Integer[] scoreInteger = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreInteger, Collections.reverseOrder());

        for (int i=m-1; i<scoreInteger.length;i+=m){
            answer += scoreInteger[i] * m;
        }

        return answer;
    }
}
