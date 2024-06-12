package test.introducton;

import introduction.Game369;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class Game369Test {

    @Test
    void solution(){
        Game369 game369 = new Game369();
        Assertions.assertThat(game369.solution(3)).isEqualTo(1);
        Assertions.assertThat(game369.solution(29423)).isEqualTo(2);
    }
}