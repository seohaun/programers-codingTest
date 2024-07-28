package test.introducton;

import introduction.FoodFight;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
class FoodFightTest {

    @Test
    void solution() {
        FoodFight foodFight = new FoodFight();
        Assertions.assertThat(foodFight.solution(new int[]{1, 3, 4, 6})).isEqualTo("1223330333221");
        Assertions.assertThat(foodFight.solution(new int[]{1, 7, 1, 2})).isEqualTo("111303111");
    }
}