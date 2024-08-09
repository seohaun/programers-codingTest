package test.codeLevel1;

import codeLevel1.OurPassword;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OurPasswordTest {

    @Test
    void solution() {
        OurPassword ourPassword = new OurPassword();
        Assertions.assertThat(ourPassword.solution("aukks","wbqd",5)).isEqualTo("happy");
    }
}