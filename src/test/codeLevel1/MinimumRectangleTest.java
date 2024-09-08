package test.codeLevel1;

import codeLevel1.MinimumRectangle;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumRectangleTest {

    @Test
    void solution() {
        MinimumRectangle minimumRectangle = new MinimumRectangle();
        Assertions.assertThat(minimumRectangle.solution(new int[][]{{60, 50},{30, 70},{60, 30},{80, 40}})).isEqualTo(4000);
        Assertions.assertThat(minimumRectangle.solution(new int[][]{{10, 7},{12, 3},{8, 15},{14, 7},{5, 15}})).isEqualTo(120);
    }
}