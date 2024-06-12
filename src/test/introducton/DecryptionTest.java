package test.introducton;

import introduction.Decryption;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DecryptionTest {

    @Test
    void solution() {
        Decryption decryption = new Decryption();
        Assertions.assertThat(decryption.solution("dfjardstddetckdaccccdegk", 4)).isEqualTo("attack");
        Assertions.assertThat(decryption.solution("pfqallllabwaoclk", 2)).isEqualTo("fallback");
    }
}