package com.gabrielwiedenhoft.folha;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Reúne os funcionários e calcula o total da folha, sem saber o cargo de cada um (polimorfismo). */
public class FolhaDePagamento {

    private final List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionar(Funcionario funcionario) {
        funcionarios.add(java.util.Objects.requireNonNull(funcionario, "O funcionário é obrigatório."));
    }

    public List<Funcionario> getFuncionarios() {
        return Collections.unmodifiableList(funcionarios);
    }

    public BigDecimal total() {
        return funcionarios.stream()
                .map(Funcionario::calculaSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
