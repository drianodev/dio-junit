package br.com.drianodev;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;

    private LocalDate nascimento;

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public Pessoa(String joão, LocalDateTime of) {
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());
    }

    public boolean ehMaiorDeIdade() {
        return getIdade() >= 18;
    }
}
