package test.introducton;

import introduction.CompletionOfATriangle;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CompletionOfATriangleTest {

    @Test
    void solution() {
        CompletionOfATriangle completionOfATriangle = new CompletionOfATriangle();
        Assertions.assertThat(completionOfATriangle.solution(new int[]{1, 2})).isEqualTo(1);
        Assertions.assertThat(completionOfATriangle.solution(new int[]{3, 6})).isEqualTo(5);
        Assertions.assertThat(completionOfATriangle.solution(new int[]{11, 7})).isEqualTo(13);

    }
}