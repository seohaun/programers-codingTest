package test.codeLevel1;

import codeLevel1.MockExam;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MockExamTest {

    @Test
    void solution() {
        MockExam mockExam = new MockExam();
        Assertions.assertThat(mockExam.solution(new int[]{1,2,3,4,5})).isEqualTo(new int[]{1});
        Assertions.assertThat(mockExam.solution(new int[]{1,3,2,4,2})).isEqualTo(new int[]{1,2,3});
    }
}