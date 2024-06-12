package test.introducton;

import introduction.ControlZ;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ControlZTest {

    @Test
    void solution() {
        ControlZ controlZ = new ControlZ();
        Assertions.assertThat(controlZ.solution("1 2 Z 3")).isEqualTo(4);
        Assertions.assertThat(controlZ.solution("10 20 30 40")).isEqualTo(100);
    }
}