package test.introducton;

import introduction.LoginSuccess;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LoginSuccessTest {

    @Test
    void solution() {
        LoginSuccess loginSuccess = new LoginSuccess();
        Assertions.assertThat(loginSuccess.solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}})).isEqualTo("login");
        Assertions.assertThat(loginSuccess.solution(new String[]{"programmer01", "15789"}, new String[][]{{"programmer02", "111111"}, {"programmer01", "134"}, {"meosseugi", "1234"}})).isEqualTo("wrong pw");
        Assertions.assertThat(loginSuccess.solution(new String[]{"rabbit04", "98761"}, new String[][]{{"programmer02", "111111"}, {"programmer01", "134"}, {"meosseugi", "1234"}})).isEqualTo("fail");

    }
}