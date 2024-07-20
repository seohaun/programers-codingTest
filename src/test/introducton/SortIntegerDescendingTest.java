package test.introducton;

import introduction.SortIntegerDescending;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SortIntegerDescendingTest {

    @Test
    void solution() {
        SortIntegerDescending sortIntegerDescending = new SortIntegerDescending();
        Assertions.assertThat(sortIntegerDescending.solution(118372)).isEqualTo(873211);
    }
}