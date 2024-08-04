package test.codeLevel1;

import codeLevel1.GetMiddleLetter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GetMiddleLetterTest {

    @Test
    void solution() {
        GetMiddleLetter getMiddleLetter = new GetMiddleLetter();
        Assertions.assertThat(getMiddleLetter.solution("abcde")).isEqualTo("c");
        Assertions.assertThat(getMiddleLetter.solution("qwer")).isEqualTo("we");
    }
}