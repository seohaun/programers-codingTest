package test.codeLevel1;

import codeLevel1.SplitString;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SplitStringTest {

    @Test
    void solution() {
        SplitString splitString = new SplitString();
        Assertions.assertThat(splitString.solution("banana")).isEqualTo(3);
        Assertions.assertThat(splitString.solution("abracadabra")).isEqualTo(6);
        Assertions.assertThat(splitString.solution("aaabbaccccabba")).isEqualTo(3);
    }
}