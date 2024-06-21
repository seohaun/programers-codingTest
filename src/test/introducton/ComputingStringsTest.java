package test.introducton;

import introduction.ComputingStrings;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ComputingStringsTest {

    @Test
    void solution() {
        ComputingStrings computingStrings = new ComputingStrings();
        Assertions.assertThat(computingStrings.solution("5 - 2")).isEqualTo(3);
        Assertions.assertThat(computingStrings.solution("5 - 12")).isEqualTo(-7);
        Assertions.assertThat(computingStrings.solution("20 + 10 - 10")).isEqualTo(20);
    }
}