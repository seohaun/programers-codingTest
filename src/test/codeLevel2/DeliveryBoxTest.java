package test.codeLevel2;

import codeLevel2.DeliveryBox;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DeliveryBoxTest {

    @Test
    void solution() {
        DeliveryBox deliveryBox = new DeliveryBox();
        Assertions.assertThat(deliveryBox.solution(new int[]{4, 3, 1, 2, 5})).isEqualTo(2);
        Assertions.assertThat(deliveryBox.solution(new int[]{5, 4, 3, 2, 1})).isEqualTo(5);
        Assertions.assertThat(deliveryBox.solution(new int[]{1, 4, 5, 3, 2})).isEqualTo(5);
        Assertions.assertThat(deliveryBox.solution(new int[]{1, 4, 5, 3, 2})).isEqualTo(5);
    }
}