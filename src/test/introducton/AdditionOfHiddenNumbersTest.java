package test.introducton;

import introduction.AdditionOfHiddenNumbers;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionOfHiddenNumbersTest {

    @Test
    void solution() {
        AdditionOfHiddenNumbers additionOfHiddenNumbers = new AdditionOfHiddenNumbers();
        Assertions.assertThat(additionOfHiddenNumbers.solution("aAb1B2cC34oOp")).isEqualTo(10);
    }
}