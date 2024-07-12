package introduction;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CurseNumber3Test {

    @Test
    void solution() {
        CurseNumber3 curseNumber3 = new CurseNumber3();
        Assertions.assertThat(curseNumber3.solution(15)).isEqualTo(25);
        Assertions.assertThat(curseNumber3.solution(40)).isEqualTo(76);
    }
}