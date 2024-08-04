package test.codeLevel1;

import codeLevel1.RemoveSmallestNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveSmallestNumberTest {

    @Test
    void solution() {
        RemoveSmallestNumber removeSmallestNumber = new RemoveSmallestNumber();
        Assertions.assertThat(removeSmallestNumber.solution(new int[]{4, 3, 2, 1})).isEqualTo(new int[]{4, 3, 2});
        Assertions.assertThat(removeSmallestNumber.solution(new int[]{10})).isEqualTo(new int[]{-1});
    }
}