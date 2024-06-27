package test.introducton;

import introduction.CutAndSaveAsAnArray;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CutAndSaveAsAnArrayTest {

    @Test
    void solution() {
        CutAndSaveAsAnArray cutAndSaveAsAnArray = new CutAndSaveAsAnArray();
        Assertions.assertThat(cutAndSaveAsAnArray.solution("abc1Addfggg4556b", 6)).isEqualTo(new String[]{"abc1Ad", "dfggg4", "556b"});
        Assertions.assertThat(cutAndSaveAsAnArray.solution("abcdef123", 3)).isEqualTo(new String[]{"abc", "def", "123"});
    }
}