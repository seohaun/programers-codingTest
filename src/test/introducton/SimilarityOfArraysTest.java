package test.introducton;

import introduction.SimilarityOfArrays;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SimilarityOfArraysTest {

    @Test
    void solution() {
        SimilarityOfArrays similarityOfArrays = new SimilarityOfArrays();
        Assertions.assertThat(similarityOfArrays.solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"})).isEqualTo(2);
        Assertions.assertThat(similarityOfArrays.solution(new String[]{"n", "omg"}, new String[]{"m", "dot"})).isEqualTo(0);
    }
}