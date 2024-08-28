package test.codeLevel1;

import codeLevel1.MakingPrimeNumbers;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MakingPrimeNumbersTest {

    @Test
    void solution() {
        MakingPrimeNumbers makingPrimeNumbers = new MakingPrimeNumbers();
        Assertions.assertThat(makingPrimeNumbers.solution(new int[]{1, 2, 3, 4})).isEqualTo(1);
    }
}