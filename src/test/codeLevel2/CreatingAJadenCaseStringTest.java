package test.codeLevel2;

import codeLevel2.CreatingAJadenCaseString;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CreatingAJadenCaseStringTest {

    @Test
    void solution() {
        CreatingAJadenCaseString creatingAJadenCaseString = new CreatingAJadenCaseString();
        Assertions.assertThat(creatingAJadenCaseString.solution("  for the what 1what  ")).isEqualTo("  For The What 1what  ");
        Assertions.assertThat(creatingAJadenCaseString.solution("   3people unFollowed me  ")).isEqualTo("   3people Unfollowed Me  ");
        Assertions.assertThat(creatingAJadenCaseString.solution("3people unFollowed me")).isEqualTo("3people Unfollowed Me");
        Assertions.assertThat(creatingAJadenCaseString.solution("for the last week")).isEqualTo("For The Last Week");
    }
}