package test.codeLevel1;

import codeLevel1.DetermineSquareRoot;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DetermineSquareRootTest {

    @Test
    void solution() {
        DetermineSquareRoot determineSquareRoot = new DetermineSquareRoot();
        Assertions.assertThat(determineSquareRoot.solution(121)).isEqualTo(144);
        Assertions.assertThat(determineSquareRoot.solution(3)).isEqualTo(-1);
    }
}