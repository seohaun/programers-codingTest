package test.codeLevel1;

import codeLevel1.GymSuit;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GymSuitTest {

    @Test
    void solution() {
        GymSuit gymSuit = new GymSuit();
        Assertions.assertThat(gymSuit.solution(5, new int[]{4, 2}, new int[]{3, 5})).isEqualTo(5);
        Assertions.assertThat(gymSuit.solution(5, new int[]{4, 2}, new int[]{3, 5})).isEqualTo(5);
        Assertions.assertThat(gymSuit.solution(5, new int[]{2, 4}, new int[]{3})).isEqualTo(4);
        Assertions.assertThat(gymSuit.solution(5, new int[]{2, 4}, new int[]{1, 3, 5})).isEqualTo(5);
        Assertions.assertThat(gymSuit.solution(5, new int[]{1, 2}, new int[]{2, 3})).isEqualTo(4);
        Assertions.assertThat(gymSuit.solution(5, new int[]{1, 2, 3}, new int[]{2, 3, 4})).isEqualTo(4);
        Assertions.assertThat(gymSuit.solution(2, new int[]{1}, new int[]{2})).isEqualTo(2);
        Assertions.assertThat(gymSuit.solution(3, new int[]{1, 2}, new int[]{2, 3})).isEqualTo(2);
        Assertions.assertThat(gymSuit.solution(5, new int[]{1, 2, 4, 5}, new int[]{2, 3, 4})).isEqualTo(3);
        Assertions.assertThat(gymSuit.solution(10, new int[]{3, 7, 8}, new int[]{1, 7, 9})).isEqualTo(9);
        Assertions.assertThat(gymSuit.solution(10, new int[]{3, 8}, new int[]{1, 5, 9})).isEqualTo(9);
        Assertions.assertThat(gymSuit.solution(10, new int[]{8}, new int[]{1, 2})).isEqualTo(9);
        Assertions.assertThat(gymSuit.solution(5, new int[]{3}, new int[]{3})).isEqualTo(5);
    }
}