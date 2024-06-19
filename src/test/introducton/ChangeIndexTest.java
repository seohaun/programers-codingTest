package test.introducton;

import introduction.ChangeIndex;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ChangeIndexTest {

    @Test
    void solution() {
        ChangeIndex changeIndex = new ChangeIndex();
        Assertions.assertThat(changeIndex.solution("hello", 1, 2)).isEqualTo("hlelo");
        Assertions.assertThat(changeIndex.solution("I love you", 3, 6)).isEqualTo("I l veoyou");
    }
}