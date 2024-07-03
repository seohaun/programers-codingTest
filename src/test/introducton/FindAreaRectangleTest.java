package test.introducton;

import introduction.FindAreaRectangle;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindAreaRectangleTest {

    @Test
    void solution() {
        FindAreaRectangle findAreaRectangle = new FindAreaRectangle();
        Assertions.assertThat(findAreaRectangle.solution(new int[][]{{0, 1}, {0, 3}, {10, 1}, {10, 3}})).isEqualTo(20);
    }
}