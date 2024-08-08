package codeLevel2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/138476#
 귤 고르기
 - 경화가 한 상자에 담으려는 귤의 개수 k와 귤의 크기를 담은 배열 tangerine
 - 경화가 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값을 return

 크기별 빈도수를 구하고 역순으로 정렬해서 서로 다른 종류 최솟값 구할 수 있도록 작성
 Map, List 사용  Map -> 크기별 빈도수 , List -> 정렬
 ( 역순 정렬은 다른 사람 코드 참고 )

 */
public class ChoosingTangerines {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> tangerineMap = new HashMap<>();
        for(int size:tangerine){
            tangerineMap.put(size, tangerineMap.getOrDefault(size, 0) + 1);
        }
        List<Integer> tangerineList = new ArrayList<>(tangerineMap.keySet());

        tangerineList.sort((size1, size2) -> tangerineMap.get(size2) - tangerineMap.get(size1));

        for (Integer size : tangerineList) {
            k -= tangerineMap.get(size);
            answer++;
            if (k <= 0) break;
        }
        return answer;
    }
}
