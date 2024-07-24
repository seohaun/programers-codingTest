package test.introducton;

import introduction.CokeProblem;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CokeProblemTest {

    @Test
    void solution() {
        CokeProblem cokeProblem = new CokeProblem();
        Assertions.assertThat(cokeProblem.solution(2,1,20)).isEqualTo(19);
        Assertions.assertThat(cokeProblem.solution(3,1,20)).isEqualTo(9);
    }
}