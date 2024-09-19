package test.codeLevel2;

import codeLevel2.NLeastCommonMultiples;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NLeastCommonMultiplesTest {

    @Test
    void solution() {
        NLeastCommonMultiples nLeastCommonMultiples = new NLeastCommonMultiples();
        Assertions.assertThat(nLeastCommonMultiples.solution(new int[]{2,6,8,14})).isEqualTo(168);
        Assertions.assertThat(nLeastCommonMultiples.solution(new int[]{1,2,3})).isEqualTo(6);
    }
}