package test.introducton;

import introduction.PackOfCards;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PackOfCardsTest {

    @Test
    void solution() {
        PackOfCards packOfCards = new PackOfCards();
        Assertions.assertThat(packOfCards.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"})).isEqualTo("Yes");
        Assertions.assertThat(packOfCards.solution(new String[]{"i", "drink", "water"}, new String[]{"to", "want"}, new String[]{"i", "want", "to", "drink", "water"})).isEqualTo("No");
    }
}