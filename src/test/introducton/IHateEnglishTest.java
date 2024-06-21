package test.introducton;

import introduction.IHateEnglish;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class IHateEnglishTest {

    @Test
    void solution() {
        IHateEnglish iHateEnglish = new IHateEnglish();
        Assertions.assertThat(iHateEnglish.solution("onetwothreefourfivesixseveneightnine")).isEqualTo(123456789);
        Assertions.assertThat(iHateEnglish.solution("onefourzerosixseven")).isEqualTo(14067);
    }
}