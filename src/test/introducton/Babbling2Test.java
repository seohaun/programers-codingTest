package test.introducton;

import introduction.Babbling2;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Babbling2Test {

    @Test
    void solution() {
        Babbling2 babbling2 = new Babbling2();
        Assertions.assertThat(babbling2.solution(new String[]{"yeayaye"})).isEqualTo(1);
        Assertions.assertThat(babbling2.solution(new String[]{"aya","yee","u","maa"})).isEqualTo(1);
    }
}