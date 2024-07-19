package test.introducton;

import introduction.Watermelon;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WatermelonTest {

    @Test
    void solution() {
        Watermelon watermelon = new Watermelon();
        Assertions.assertThat(watermelon.solution(3)).isEqualTo("수박수");
        Assertions.assertThat(watermelon.solution(4)).isEqualTo("수박수박");
    }
}