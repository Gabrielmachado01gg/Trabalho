/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_interface;

/**
 *
 * @author gabri
 */
public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, String matricula, double salarioBase, double comissao) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        return getSalarioBase() + comissao;
    }
}