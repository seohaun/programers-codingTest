package test.codeLevel1;

import codeLevel1.CaesarPassword;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CaesarPasswordTest {

    @Test
    void solution() {
        CaesarPassword caesarPassword = new CaesarPassword();
        Assertions.assertThat(caesarPassword.solution("AB",1)).isEqualTo("BC");
        Assertions.assertThat(caesarPassword.solution("z",1)).isEqualTo("a");
        Assertions.assertThat(caesarPassword.solution("a B z",4)).isEqualTo("e F d");
    }
}