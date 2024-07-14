package test.introducton;

import introduction.WalkInThePark;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WalkInTheParkTest {

    @Test
    void solution() {
        WalkInThePark walkInThePark = new WalkInThePark();
        Assertions.assertThat(walkInThePark.solution(new String[]{"SOO", "OOO", "XOO"}, new String[]{"S 1"})).isEqualTo(new int[]{1, 0});
        Assertions.assertThat(walkInThePark.solution(new String[]{"OXO", "XSX", "OXO"}, new String[]{"S 1", "E 1", "W 1", "N 1"})).isEqualTo(new int[]{1, 1});
        Assertions.assertThat(walkInThePark.solution(new String[]{"SXO", "OXX", "OOO"}, new String[]{"E 4", "S 4", "N 4", "S 1", "S 1", "E 2"})).isEqualTo(new int[]{2,2});
        Assertions.assertThat(walkInThePark.solution(new String[]{"OXO", "XSX", "OXO"}, new String[]{"S 1", "E 1", "W 1", "N 1"})).isEqualTo(new int[]{1,1});
        Assertions.assertThat(walkInThePark.solution(new String[]{"XOSO0", "OOOOO", "OOOOO"}, new String[]{"W 1"})).isEqualTo(new int[]{0,1});
        Assertions.assertThat(walkInThePark.solution(new String[]{"OOSOX", "OOOOO", "OOOOO"}, new String[]{"E 1"})).isEqualTo(new int[]{0,3});
        Assertions.assertThat(walkInThePark.solution(new String[]{"OSO", "OOO", "OXO", "OOO"}, new String[]{"E 2", "S 3", "W 1", "S 1", "E 2"})).isEqualTo(new int[]{1,2});
        Assertions.assertThat(walkInThePark.solution(new String[]{"SOOXO", "OOOXO", "OXOOO", "XOOOO"}, new String[]{"E 2", "S 2", "W 2", "S 1", "W 1"})).isEqualTo(new int[]{3,1});
        Assertions.assertThat(walkInThePark.solution(new String[]{"OXXO", "XSXO", "XXXX"}, new String[]{"E 1", "N 1"})).isEqualTo(new int[]{1,1});
        Assertions.assertThat(walkInThePark.solution(new String[]{"OXXO", "XSXO", "XXXX"}, new String[]{"E 1", "S 1"})).isEqualTo(new int[]{1,1});
    }
}