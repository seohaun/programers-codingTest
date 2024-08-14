package test.codeLevel2;

import codeLevel2.DefenseGame;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DefenseGameTest {

    @Test
    void solution() {
        DefenseGame defenseGame = new DefenseGame();
        Assertions.assertThat(defenseGame.solution(5,1,new int[]{3, 1, 1, 1, 2, 2, 10})).isEqualTo(5);
        Assertions.assertThat(defenseGame.solution(10,2,new int[]{8, 6, 5, 3, 2})).isEqualTo(5);
        Assertions.assertThat(defenseGame.solution(10,2,new int[]{5, 5, 5, 5, 5})).isEqualTo(4);
        Assertions.assertThat(defenseGame.solution(7,3,new int[]{4, 2, 4, 5, 3, 3, 1})).isEqualTo(5);
    }
}