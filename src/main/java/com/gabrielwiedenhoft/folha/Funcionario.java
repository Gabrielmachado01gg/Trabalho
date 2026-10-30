package com.gabrielwiedenhoft.folha;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Funcionário da empresa. Cada cargo define a própria regra de cálculo do salário
 * (polimorfismo), mas todos compartilham nome, matrícula e salário base.
 */
public abstract class Funcionario {

    private final String nome;
    private final String matricula;
    private final BigDecimal salarioBase;

    protected Funcionario(String nome, String matricula, BigDecimal salarioBase) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome é obrigatório.");
        }
        if (matricula == null || matricula.isBlank()) {
            throw new IllegalArgumentException("A matrícula é obrigatória.");
        }
        if (salarioBase == null || salarioBase.signum() < 0) {
            throw new IllegalArgumentException("O salário base não pode ser negativo.");
        }
        this.nome = nome.trim();
        this.matricula = matricula.trim();
        this.salarioBase = salarioBase.setScale(2, RoundingMode.HALF_EVEN);
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    /** Nome do cargo, usado nos relatórios. */
    public abstract String getCargo();

    /** Salário final do mês, de acordo com a regra de cada cargo. */
    public abstract BigDecimal calculaSalario();

    @Override
    public String toString() {
        return "%s %s (matrícula %s)".formatted(getCargo(), nome, matricula);
    }
}
