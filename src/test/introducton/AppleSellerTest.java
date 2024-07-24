package test.introducton;

import introduction.AppleSeller;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AppleSellerTest {

    @Test
    void solution() {
        AppleSeller appleSeller = new AppleSeller();
        Assertions.assertThat(appleSeller.solution(3,4,new int[]{1, 2, 3, 1, 2, 3, 1})).isEqualTo(8);
        Assertions.assertThat(appleSeller.solution(3,3,new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2})).isEqualTo(33);
    }
}