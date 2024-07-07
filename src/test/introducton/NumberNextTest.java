package test.introducton;

import introduction.NumberNext;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberNextTest {

    @Test
    void solution() {
        NumberNext numberNext = new NumberNext();
        Assertions.assertThat(numberNext.solution(new int[]{32, 16, 8})).isEqualTo(4);
        Assertions.assertThat(numberNext.solution(new int[]{1, 2, 3, 4})).isEqualTo(5);
    }
}