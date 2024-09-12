package test.codeLevel2;

import codeLevel2.FindTheNextBigNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindTheNextBigNumberTest {

    @Test
    void solution() {
        FindTheNextBigNumber findTheNextBigNumber = new FindTheNextBigNumber();
        Assertions.assertThat(findTheNextBigNumber.solution(new int[]{8, 1, 2, 9})).isEqualTo(new int[]{9, 2, 9, -1});
        Assertions.assertThat(findTheNextBigNumber.solution(new int[]{9, 1, 5, 3, 6, 2})).isEqualTo(new int[]{-1, 5, 6, 6, -1, -1});
        Assertions.assertThat(findTheNextBigNumber.solution(new int[]{2, 3, 3, 5})).isEqualTo(new int[]{3, 5, 5, -1});
    }
}