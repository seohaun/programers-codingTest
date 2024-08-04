package test.codeLevel1;

import codeLevel1.RoughlyMadeKeyboard;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RoughlyMadeKeyboardTest {

    @Test
    void solution() {
        RoughlyMadeKeyboard roughlyMadeKeyboard = new RoughlyMadeKeyboard();
        Assertions.assertThat(roughlyMadeKeyboard.solution(new String[]{"ABC"}, new String[]{"AD"})).isEqualTo(new int[]{-1});
        Assertions.assertThat(roughlyMadeKeyboard.solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA", "BGZ"})).isEqualTo(new int[]{4, 6});
        Assertions.assertThat(roughlyMadeKeyboard.solution(new String[]{"BC"}, new String[]{"AC", "BC"})).isEqualTo(new int[]{-1, 3});
        Assertions.assertThat(roughlyMadeKeyboard.solution(new String[]{"ABCDE"}, new String[]{"FGHIJ"})).isEqualTo(new int[]{-1});
        Assertions.assertThat(roughlyMadeKeyboard.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"})).isEqualTo(new int[]{9, 4});
        Assertions.assertThat(roughlyMadeKeyboard.solution(new String[]{"AA"}, new String[]{"B"})).isEqualTo(new int[]{-1});
        Assertions.assertThat(roughlyMadeKeyboard.solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA", "BGZ"})).isEqualTo(new int[]{4, 6});
    }
}