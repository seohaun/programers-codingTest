package test.introducton;

import introduction.LengthOfSegments;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthOfSegmentsTest {

    @Test
    void solution() {
        LengthOfSegments lengthOfSegments = new LengthOfSegments();
        Assertions.assertThat(lengthOfSegments.solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}})).isEqualTo(0);
        Assertions.assertThat(lengthOfSegments.solution(new int[][]{{4, 7}, {4, 5}, {6, 7}})).isEqualTo(2);
        Assertions.assertThat(lengthOfSegments.solution(new int[][]{{0, 1}, {2, 5}, {3, 9}})).isEqualTo(2);
        Assertions.assertThat(lengthOfSegments.solution(new int[][]{{0, 2}, {-3, -1}, {-2, 1}})).isEqualTo(2);
        Assertions.assertThat(lengthOfSegments.solution(new int[][]{{0, 5}, {3, 9}, {1, 10}})).isEqualTo(8);
        Assertions.assertThat(lengthOfSegments.solution(new int[][]{{1, 2}, {2, 3}, {3, 4}})).isEqualTo(0);
    }
}