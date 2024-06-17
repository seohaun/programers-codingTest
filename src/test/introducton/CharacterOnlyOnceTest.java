package test.introducton;

import introduction.CharacterOnlyOnce;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CharacterOnlyOnceTest {

    @Test
    void solution() {
        CharacterOnlyOnce characterOnlyOnce = new CharacterOnlyOnce();
        Assertions.assertThat(characterOnlyOnce.solution("abcabcadc")).isEqualTo("d");
        Assertions.assertThat(characterOnlyOnce.solution("abdc")).isEqualTo("abcd");
        Assertions.assertThat(characterOnlyOnce.solution("hello")).isEqualTo("eho");
    }
}