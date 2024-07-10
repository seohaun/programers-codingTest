package introduction;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SafeZoneTest {

    @Test
    void solution() {
        SafeZone safeZone = new SafeZone();
        Assertions.assertThat(safeZone.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}})).isEqualTo(16);
        Assertions.assertThat(safeZone.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}})).isEqualTo(13);
        Assertions.assertThat(safeZone.solution(new int[][]{{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}})).isEqualTo(0);
    }
}