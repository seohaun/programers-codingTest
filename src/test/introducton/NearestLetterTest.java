package test.introducton;

import introduction.NearestLetter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NearestLetterTest {

    @Test
    void solution() {
        NearestLetter nearestLetter = new NearestLetter();
        Assertions.assertThat(nearestLetter.solution("banana")).isEqualTo(new int[]{-1, -1, -1, 2, 2, 2});
        Assertions.assertThat(nearestLetter.solution("foobar")).isEqualTo(new int[]{-1, -1, 1, -1, -1, -1});
        Assertions.assertThat(nearestLetter.solution("error")).isEqualTo(new int[]{-1, -1, 1, -1, 2});
        Assertions.assertThat(nearestLetter.solution("abcda")).isEqualTo(new int[]{-1,-1,-1,-1,4});
    }
}