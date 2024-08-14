package codeLevel2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 https://school.programmers.co.kr/learn/courses/30/lessons/142085
 디펜스 게임

 int[] enemy 내림 차순 정렬 후에 int k만큼 상위 값 추출해서 그걸 map 으로 key = 숫자 , value = 숫자count 작업
 */
public class DefenseGame_실패 {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        final int[] sumTemp = {0};
        int finalN = n;
        List<Integer> resultList = Arrays.stream(enemy)
                .mapToObj(i -> {
                    sumTemp[0] += i;
                    return i;
                })
                .takeWhile(i -> sumTemp[0] <= finalN) // sum이 n을 초과할 때까지
                .collect(Collectors.toList());

        Integer[] sortedArray = resultList.stream()
                .sorted((a, b) -> b - a) // 내림차순 정렬
                .limit(k)
                .toArray(Integer[]::new); // Integer[]로 변환

        // 숫자별 등장 횟수 계산
        Map<Integer, Long> countMap = Arrays.stream(sortedArray)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(int i=0; i<enemy.length;i++){
            if(countMap.getOrDefault(enemy[i],(long)0) > 0){
                countMap.merge(enemy[i], (long)-1, Long::sum);
            }else{
                n -= enemy[i];
            }
            if(n<0) return answer;
            answer++;
        }

        return answer;
    }
}
