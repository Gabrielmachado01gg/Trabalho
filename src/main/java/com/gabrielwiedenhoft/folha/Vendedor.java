package com.gabrielwiedenhoft.folha;

import java.math.BigDecimal;
import java.math.RoundingMode;

/** Vendedor recebe o salário base mais uma comissão. */
public class Vendedor extends Funcionario {

    private final BigDecimal comissao;

    public Vendedor(String nome, String matricula, BigDecimal salarioBase, BigDecimal comissao) {
        super(nome, matricula, salarioBase);
        if (comissao == null || comissao.signum() < 0) {
            throw new IllegalArgumentException("A comissão não pode ser negativa.");
        }
        this.comissao = comissao.setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal getComissao() {
        return comissao;
    }

    @Override
    public String getCargo() {
        return "Vendedor";
    }

    @Override
    public BigDecimal calculaSalario() {
        return getSalarioBase().add(comissao);
    }
}
