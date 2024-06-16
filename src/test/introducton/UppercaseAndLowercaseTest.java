package test.introducton;

import introduction.UppercaseAndLowercase;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class UppercaseAndLowercaseTest {

    @Test
    void solution() {
        UppercaseAndLowercase uppercaseAndLowercase = new UppercaseAndLowercase();
        Assertions.assertThat(uppercaseAndLowercase.solution("cccCCC")).isEqualTo("CCCccc");
        Assertions.assertThat(uppercaseAndLowercase.solution("abCdEfghIJ")).isEqualTo("ABcDeFGHij");
    }
}