package com.gabrielwiedenhoft.folha;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class FuncionarioTest {

    private static BigDecimal reais(String valor) {
        return new BigDecimal(valor);
    }

    @Test
    void gerenteRecebeODobroDoSalarioBase() {
        assertEquals(reais("10000.00"), new Gerente("Marina", "1", reais("5000")).calculaSalario());
    }

    @Test
    void assistenteRecebeSomenteOSalarioBase() {
        assertEquals(reais("3000.00"), new Assistente("Carlos", "2", reais("3000")).calculaSalario());
    }

    @Test
    void vendedorRecebeSalarioBaseMaisComissao() {
        assertEquals(reais("3000.00"), new Vendedor("Julia", "3", reais("2500"), reais("500")).calculaSalario());
    }

    @Test
    void rejeitaDadosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Assistente(" ", "1", reais("1000")));
        assertThrows(IllegalArgumentException.class, () -> new Assistente("Ana", "", reais("1000")));
        assertThrows(IllegalArgumentException.class, () -> new Assistente("Ana", "1", reais("-1")));
        assertThrows(IllegalArgumentException.class, () -> new Vendedor("Ana", "1", reais("1000"), reais("-5")));
    }

    @Test
    void cargoIdentificaOTipoDeFuncionario() {
        assertEquals("Gerente", new Gerente("Marina", "1", reais("1")).getCargo());
        assertEquals("Vendedor", new Vendedor("Julia", "3", reais("1"), reais("1")).getCargo());
    }
}
