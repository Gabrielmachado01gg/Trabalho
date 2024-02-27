/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_interface;

/**
 *
 * @author gabri
 */
public class Gerente extends Funcionario {
    public Gerente(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public double calculaSalario() {
        return 2 * getSalarioBase();
    }
}


