package test.introducton;

import introduction.DeterminingFiniteDecimalNumbers;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DeterminingFiniteDecimalNumbersTest {

    @Test
    void solution() {
        DeterminingFiniteDecimalNumbers determiningFiniteDecimalNumbers = new DeterminingFiniteDecimalNumbers();
        Assertions.assertThat(determiningFiniteDecimalNumbers.solution(7, 20)).isEqualTo(1);
        Assertions.assertThat(determiningFiniteDecimalNumbers.solution(11, 22)).isEqualTo(1);
        Assertions.assertThat(determiningFiniteDecimalNumbers.solution(12, 21)).isEqualTo(2);
        Assertions.assertThat(determiningFiniteDecimalNumbers.solution(9, 6)).isEqualTo(1);
    }
}