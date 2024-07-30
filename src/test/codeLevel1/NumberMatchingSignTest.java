package test.codeLevel1;

import codeLevel1.NumberMatchingSign;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberMatchingSignTest {
    @Test
    void solution() {
        NumberMatchingSign numberMatchingSign = new NumberMatchingSign();
        Assertions.assertThat(numberMatchingSign.solution("100","2345")).isEqualTo("-1");
        Assertions.assertThat(numberMatchingSign.solution("100","203045")).isEqualTo("0");
        Assertions.assertThat(numberMatchingSign.solution("100","123450")).isEqualTo("10");
        Assertions.assertThat(numberMatchingSign.solution("12321","42531")).isEqualTo("321");
        Assertions.assertThat(numberMatchingSign.solution("5525","1255")).isEqualTo("552");
        Assertions.assertThat(numberMatchingSign.solution("111", "1111")).isEqualTo("111");
    }
}