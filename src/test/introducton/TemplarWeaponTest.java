package test.introducton;

import introduction.TemplarWeapon;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TemplarWeaponTest {

    @Test
    void solution() {
        TemplarWeapon templarWeapon = new TemplarWeapon();
        Assertions.assertThat(templarWeapon.solution(5,3,2)).isEqualTo(10);
        Assertions.assertThat(templarWeapon.solution(10,3,2)).isEqualTo(21);
    }
}