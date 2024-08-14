package test.codeLevel1;

import codeLevel1.HallOfFame1;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HallOfFame1Test {

    @Test
    void solution() {
        HallOfFame1 hallOfFame1 = new HallOfFame1();
        Assertions.assertThat( hallOfFame1.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})).isEqualTo(new int[]{10, 10, 10, 20, 20, 100, 100});
        Assertions.assertThat( hallOfFame1.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})).isEqualTo(new int[]{0, 0, 0, 0, 20, 40, 70, 70, 150, 300});
    }
}