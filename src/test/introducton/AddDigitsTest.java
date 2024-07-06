package test.introducton;

import introduction.AddDigits;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AddDigitsTest {

    @Test
    void solution() {
        AddDigits addDigits = new AddDigits();
        Assertions.assertThat(addDigits.solution(addDigits.solution(1234))).isEqualTo(10);
        Assertions.assertThat(addDigits.solution(addDigits.solution(930211))).isEqualTo(16);
    }
}