package test.introducton;

import introduction.Babbling;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BabblingTest {

    @Test
    void solution() {
        Babbling babbling = new Babbling();
        Assertions.assertThat(babbling.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"})).isEqualTo(1);
        Assertions.assertThat(babbling.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"})).isEqualTo(3);
    }
}