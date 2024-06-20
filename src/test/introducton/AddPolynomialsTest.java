package test.introducton;

import introduction.AddPolynomials;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AddPolynomialsTest {

    @Test
    void solution() {
        AddPolynomials addPolynomials = new AddPolynomials();
        Assertions.assertThat(addPolynomials.solution("3x + 7 + x")).isEqualTo("4x + 7");
        Assertions.assertThat(addPolynomials.solution("x + x + x")).isEqualTo("3x");
    }
}