package com.gabrielwiedenhoft.folha;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class FolhaDePagamentoTest {

    @Test
    void totalSomaOSalarioDeTodosOsCargos() {
        FolhaDePagamento folha = new FolhaDePagamento();
        folha.adicionar(new Gerente("Marina", "1", new BigDecimal("5000")));
        folha.adicionar(new Assistente("Carlos", "2", new BigDecimal("3000")));
        folha.adicionar(new Vendedor("Julia", "3", new BigDecimal("2500"), new BigDecimal("500")));
        assertEquals(new BigDecimal("16000.00"), folha.total());
    }

    @Test
    void folhaVaziaTemTotalZero() {
        assertEquals(0, BigDecimal.ZERO.compareTo(new FolhaDePagamento().total()));
    }

    @Test
    void listaDeFuncionariosNaoPodeSerAlteradaPorFora() {
        FolhaDePagamento folha = new FolhaDePagamento();
        assertThrows(UnsupportedOperationException.class, () -> folha.getFuncionarios().clear());
    }
}
