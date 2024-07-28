package introduction;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/134240
 푸드 파이트
 -  3가지의 음식이 준비되어 있으며, 칼로리가 적은 순서대로 1번 음식을 3개, 2번 음식을 4개, 3번 음식을 6개 준비했으며, 물을 편의상 0번 음식이라고 칭한다면, 두 선수는 1번 음식 1개, 2번 음식 2개, 3번 음식 3개씩을 먹게 되므로 음식의 배치는 "1223330333221"이 됩니다. 따라서 1번 음식 1개는 대회에 사용하지 못합니다.
 food에 배열만큼 음식이 준비 되어있을때 1:1 대결을 하는 음식의 배치를 리턴하는 문제
food	        result
[1, 3, 4, 6]	"1223330333221"
[1, 7, 1, 2]	"111303111"


 food의 첫번째 값은 1번이라는걸 나타내기 때문에 pass 하고 그 다음 값부터 갯수.
 갯수를 2로 나눠서 몫만큼 숫자를 앞 뒤로 추가 하는 로직으로 작성
 */
public class FoodFight {
    public String solution(int[] food) {
        StringBuilder foodText = new StringBuilder();
        for(int i=1; i<food.length;i++){
            int foodCnt = food[i] / 2;
            foodText.append((i+"").repeat(foodCnt));
        }
        StringBuilder reverseFoodText = new StringBuilder(foodText);
        reverseFoodText.reverse();
        return foodText + "0" + reverseFoodText;
    }
}
