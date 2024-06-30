package test.introducton;

import introduction.Parallel;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ParallelTest {

    @Test
    void solution() {
        Parallel parallel = new Parallel();
        Assertions.assertThat(parallel.solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}})).isEqualTo(1);
        Assertions.assertThat(parallel.solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}})).isEqualTo(0);
    }
}