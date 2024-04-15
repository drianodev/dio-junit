package br.com.drianodev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa pessoa = new Pessoa("Adriano", LocalDate.of(2002, 9, 29));
        Assertions.assertEquals(21, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa pessoa1 = new Pessoa("Adriano", LocalDate.of(2002, 9, 29));
        Pessoa pessoa2 = new Pessoa("Sarah", LocalDate.of(2002, 9, 29));
        Assertions.assertTrue(pessoa1.ehMaiorDeIdade());
        Assertions.assertFalse(pessoa2.ehMaiorDeIdade());
    }
}
