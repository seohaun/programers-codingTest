package test.introducton;

import introduction.TestYourPersonalityType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestYourPersonalityTypeTest {

    @Test
    void solution() {
        TestYourPersonalityType testYourPersonalityType = new TestYourPersonalityType();
        Assertions.assertThat(testYourPersonalityType.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"},new int[]{5, 3, 2, 7, 5})).isEqualTo("TCMA");
        Assertions.assertThat(testYourPersonalityType.solution(new String[]{"TR", "RT", "TR"},new int[]{7,1,3})).isEqualTo("RCJA");
    }

}
