package com.gabrielwiedenhoft.folha;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();
        folha.adicionar(new Gerente("Marina Alves", "123", new BigDecimal("5000")));
        folha.adicionar(new Assistente("Carlos Pereira", "456", new BigDecimal("3000")));
        folha.adicionar(new Vendedor("Julia Santos", "789", new BigDecimal("2500"), new BigDecimal("500")));

        NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        for (Funcionario funcionario : folha.getFuncionarios()) {
            System.out.printf("%-45s %s%n", funcionario, moeda.format(funcionario.calculaSalario()));
        }
        System.out.printf("%-45s %s%n", "Total da folha", moeda.format(folha.total()));
    }
}
