package test.introducton;

import introduction.FindKimInSeoul;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindKimInSeoulTest {

    @Test
    void solution() {
        FindKimInSeoul findKimInSeoul = new FindKimInSeoul();
        Assertions.assertThat(findKimInSeoul.solution(new String[]{"Jane", "Kim"})).isEqualTo("김서방은 1에 있다");
    }
}