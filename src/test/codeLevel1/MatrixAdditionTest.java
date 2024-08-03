package test.codeLevel1;

import codeLevel1.MatrixAddition;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MatrixAdditionTest {

    @Test
    void solution() {
        MatrixAddition matrixAddition = new MatrixAddition();
        Assertions.assertThat(matrixAddition.solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}})).isEqualTo(new int[][]{{4, 6}, {7, 9}});
        Assertions.assertThat(matrixAddition.solution(new int[][]{{1, 2}}, new int[][]{{3, 4}})).isEqualTo(new int[][]{{4, 6}});
    }
}