package basicTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 주사위 게임 3
 - 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
 - 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
 - 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
 - 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
 - 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
 - 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
 - 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 제한사항
 - a, b, c, d는 1 이상 6 이하의 정수입니다.
 입출력 예
 - a	b	c	d	result
 - 2	2	2	2	2222
 - 4	1	4	4	1681
 - 6	3	3	6	27
 - 2	5	2	6	30
 - 6	4	2	5	2
 */
public class DiceGame3 {
    public static void main(String[] args) {

        int solution = solution(4, 1, 4, 4);
        if (1681 == solution) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }

    public static int solution(int a, int b, int c, int d) {
        List<Integer> diceList = new ArrayList<>(List.of(a, b, c, d));
        Collections.sort(diceList);

        int one = diceList.get(0);
        int two = diceList.get(1);
        int three = diceList.get(2);
        int four = diceList.get(3);

        if (one == four) {
            return 1111 * one;
        }
        if (one == three || two == four) {
            return one == three ? (10 * one + four) * (10 * one + four) : two == four ? (10 * two + one) * (10 * two + one) : 0;
        }
        if (one == two && three == four) {
            return (one + three) * Math.abs(one - three);
        }
        return one == two ? three * four : two == three ? one * four : three == four ? one * two : one;
    }

}
