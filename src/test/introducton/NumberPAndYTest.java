package test.introducton;

import introduction.NumberPAndY;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class NumberPAndYTest {

    @Test
    void solution() {
        NumberPAndY numberPAndY = new NumberPAndY();
        Assertions.assertThat(numberPAndY.solution("pPoooyY")).isEqualTo(true);
        Assertions.assertThat(numberPAndY.solution("Pyy")).isEqualTo(false);
    }
}