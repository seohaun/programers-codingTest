package test.introducton;

import introduction.CharacterCoordinates;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CharacterCoordinatesTest {

    @Test
    void solution() {
        CharacterCoordinates characterCoordinates = new CharacterCoordinates();
        Assertions.assertThat(characterCoordinates.solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})).isEqualTo(new int[]{2, 1});
        Assertions.assertThat(characterCoordinates.solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})).isEqualTo(new int[]{2, 1});
    }
}