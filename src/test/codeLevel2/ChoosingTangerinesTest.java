package test.codeLevel2;

import codeLevel2.ChoosingTangerines;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ChoosingTangerinesTest {

    @Test
    void solution() {
        ChoosingTangerines choosingTangerines = new ChoosingTangerines();
        Assertions.assertThat(choosingTangerines.solution(6,new int[]{1, 3, 2, 5, 4, 5, 2, 3})).isEqualTo(3);
        Assertions.assertThat(choosingTangerines.solution(4,new int[]{1, 3, 2, 5, 4, 5, 2, 3})).isEqualTo(2);
        Assertions.assertThat(choosingTangerines.solution(2,new int[]{1, 1, 1, 1, 2, 2, 2, 3})).isEqualTo(1);
    }
}