package test.introducton;

import introduction.MakeBWithA;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MakeBWithATest {

    @Test
    void solution() {
        MakeBWithA makeBWithA = new MakeBWithA();
        Assertions.assertThat(makeBWithA.solution("olleh", "hello")).isEqualTo(1);
        Assertions.assertThat(makeBWithA.solution("allpe", "apple")).isEqualTo(0);
    }
}