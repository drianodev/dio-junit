package br.com.drianodev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class ConditionsTest {

    @Test
    void validarAlgoSomenteNoUsuarioAdriano() {
        Assumptions.assumeTrue("adriano".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "adriano")
    void validarAlgoSomenteNoUsuarioDeterminado() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
