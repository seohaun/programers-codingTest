package test.codeLevel2;

import codeLevel2.CorrectParentheses;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CorrectParenthesesTest {

    @Test
    void solution() {
        CorrectParentheses correctParentheses = new CorrectParentheses();
        Assertions.assertThat(correctParentheses.solution("()()")).isEqualTo(true);
        Assertions.assertThat(correctParentheses.solution("(())()")).isEqualTo(true);
        Assertions.assertThat(correctParentheses.solution(")()(")).isEqualTo(false);
        Assertions.assertThat(correctParentheses.solution("(()(")).isEqualTo(false);
    }
}