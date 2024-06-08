package test.introducton;

import introduction.AdditionOfHiddenNumbers;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AdditionOfHiddenNumbersTest {

    @Test
    void solution() {
        AdditionOfHiddenNumbers additionOfHiddenNumbers = new AdditionOfHiddenNumbers();
        Assertions.assertThat(AdditionOfHiddenNumbers.solution("aAb1B2cC34oOp")).isEqualTo(10);
    }
}