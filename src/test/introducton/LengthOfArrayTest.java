package test.introducton;

import introduction.LengthOfArray;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthOfArrayTest {

    @Test
    void solution() {
        Assertions.assertThat(LengthOfArray.solution(new String[]{"We", "are", "the", "world!"})).isEqualTo(new int[]{2, 3, 3, 6});
        Assertions.assertThat(LengthOfArray.solution(new String[]{"I", "Love", "Programmers."})).isEqualTo(new int[]{1, 4, 12});
    }
}