package test.introducton;

import introduction.RemoveDuplicate;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicateTest {

    @Test
    void solution() {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        Assertions.assertThat(removeDuplicate.solution("people")).isEqualTo("peol");
        Assertions.assertThat(removeDuplicate.solution("We are the world")).isEqualTo("We arthwold");
    }
}