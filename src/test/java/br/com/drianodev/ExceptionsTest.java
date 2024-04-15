package br.com.drianodev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        Transferencias transferenciaEntreContas = new Transferencias();

        // valida o lançamento da exceção
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
        // valida se não vai ser lançado
        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
    }
}
