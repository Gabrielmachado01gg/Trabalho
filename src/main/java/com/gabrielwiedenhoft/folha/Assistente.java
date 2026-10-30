package com.gabrielwiedenhoft.folha;

import java.math.BigDecimal;

/** Assistente recebe somente o salário base. */
public class Assistente extends Funcionario {

    public Assistente(String nome, String matricula, BigDecimal salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public String getCargo() {
        return "Assistente";
    }

    @Override
    public BigDecimal calculaSalario() {
        return getSalarioBase();
    }
}
