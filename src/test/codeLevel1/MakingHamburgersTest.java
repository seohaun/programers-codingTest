package test.codeLevel1;

import codeLevel1.MakingHamburgers;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MakingHamburgersTest {

    @Test
    void solution() {
        MakingHamburgers makingHamburgers = new MakingHamburgers();
        Assertions.assertThat(makingHamburgers.solution(new int[]{1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 1, 1})).isEqualTo(2);
        Assertions.assertThat(makingHamburgers.solution(new int[]{1, 1, 2, 3, 3, 1, 2, 3, 1, 2, 3, 1})).isEqualTo(1);
        Assertions.assertThat(makingHamburgers.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1})).isEqualTo(2);
        Assertions.assertThat(makingHamburgers.solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2})).isEqualTo(0);
    }
}