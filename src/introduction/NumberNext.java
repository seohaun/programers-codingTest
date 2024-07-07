package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/120924
 다음에 올 숫자
 - 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.

 */
public class NumberNext {
    public int solution(int[] common) {
        double answer = common[common.length - 1];
        int diff1 = common[1] - common[0];
        int diff2 = common[2] - common[1];

        if (diff1 == diff2) {
            answer += diff1;
        } else if (common[2] / common[1] == common[1] / common[0]) {
            answer *= ((double) common[2] / (double) common[1]);
        }
        return (int)answer;
    }
}
