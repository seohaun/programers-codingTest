package test.codeLevel1;

import codeLevel1.ApplyMorePaint;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ApplyMorePaintTest {

    @Test
    void solution() {
        ApplyMorePaint applyMorePaint = new ApplyMorePaint();
        Assertions.assertThat(applyMorePaint.solution(16,4,new int[]{1,5,7,9,13})).isEqualTo(4);
        Assertions.assertThat(applyMorePaint.solution(10,4,new int[]{1, 2, 3, 10})).isEqualTo(2);
    }
}