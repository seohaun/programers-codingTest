package test.codeLevel2;

import codeLevel2.MaximumAndMinimum;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumAndMinimumTest {

    @Test
    void solution() {
        MaximumAndMinimum maximumAndMinimum = new MaximumAndMinimum();
        Assertions.assertThat(maximumAndMinimum.solution("1 2 3 4")).isEqualTo("1 4");
        Assertions.assertThat(maximumAndMinimum.solution("-1 -2 -3 -4")).isEqualTo("-4 -1");
        Assertions.assertThat(maximumAndMinimum.solution("-1 -1")).isEqualTo("-1 -1");
    }
}