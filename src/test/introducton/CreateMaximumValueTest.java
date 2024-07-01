package test.introducton;

import introduction.CreateMaximumValue;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CreateMaximumValueTest {

    @Test
    void solution() {
        CreateMaximumValue createMaximumValue = new CreateMaximumValue();
        Assertions.assertThat(createMaximumValue.solution(new int[]{1, 2, -3, 4, -5})).isEqualTo(15);
        Assertions.assertThat(createMaximumValue.solution(new int[]{0, -31, 24, 10, 1, 9})).isEqualTo(240);
        Assertions.assertThat(createMaximumValue.solution(new int[]{10, 20, 30, 5, 5, 20, 5})).isEqualTo(600);
    }
}