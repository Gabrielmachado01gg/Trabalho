package com.gabrielwiedenhoft.folha;

import java.math.BigDecimal;

/** Gerente recebe o dobro do salário base. */
public class Gerente extends Funcionario {

    public Gerente(String nome, String matricula, BigDecimal salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public String getCargo() {
        return "Gerente";
    }

    @Override
    public BigDecimal calculaSalario() {
        return getSalarioBase().multiply(BigDecimal.valueOf(2));
    }
}
