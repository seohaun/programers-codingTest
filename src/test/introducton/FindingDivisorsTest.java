package test.introducton;

import introduction.FindingDivisors;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindingDivisorsTest {

    @Test
    void solution() {
        FindingDivisors findingDivisors = new FindingDivisors();
        Assertions.assertThat(findingDivisors.solution(24)).isEqualTo(new int[]{1, 2, 3, 4, 6, 8, 12, 24});
        Assertions.assertThat(findingDivisors.solution(29)).isEqualTo(new int[]{1, 29});
    }
}