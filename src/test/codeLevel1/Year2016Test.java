package test.codeLevel1;

import codeLevel1.Year2016;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Year2016Test {

    @Test
    void solution() {
        Year2016 year2016 = new Year2016();
        Assertions.assertThat(year2016.solution(5,24)).isEqualTo("TUE");
    }
}