package test.codeLevel2;

import codeLevel2.Joystick;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class JoystickTest {

    @Test
    void solution() {
        Joystick joystick = new Joystick();
        Assertions.assertThat(joystick.solution("JNAAAJN")).isEqualTo(44+4);
        Assertions.assertThat(joystick.solution("JERAAOAAEN")).isEqualTo(51+9);
        Assertions.assertThat(joystick.solution("JERAAAAOEN")).isEqualTo(51+7);
        Assertions.assertThat(joystick.solution("JEROEN")).isEqualTo(56);
    }
}