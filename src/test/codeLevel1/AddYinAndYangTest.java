package test.codeLevel1;

import codeLevel1.AddYinAndYang;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AddYinAndYangTest {

    @Test
    void solution() {
        AddYinAndYang addYinAndYang = new AddYinAndYang();
        Assertions.assertThat(addYinAndYang.solution(new int[]{4,7,12}, new boolean[]{true,false,true})).isEqualTo(9);
        Assertions.assertThat(addYinAndYang.solution(new int[]{1,2,3}, new boolean[]{false,false,true})).isEqualTo(0);
    }
}