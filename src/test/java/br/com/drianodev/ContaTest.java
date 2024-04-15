package br.com.drianodev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {

    @Test
    void validaSaldo() {
        Conta conta = new Conta("123456", 100);
        Assertions.assertNotNull(conta); // verifica se não é null

        conta.lancaCredito(50);

        Assertions.assertEquals(150, conta.getSaldo()); // verifica se são iguais

        conta.lancaDebito(50);

        Assertions.assertEquals(100, conta.getSaldo()); // verifica se são iguais

        Assertions.assertNotEquals(101, conta.getSaldo()); // verifica se são diferentes

        conta = null;
        Assertions.assertNull(conta); // verifica se é null
    }

}