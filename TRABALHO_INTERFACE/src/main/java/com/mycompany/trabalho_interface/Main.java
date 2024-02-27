/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_interface;

/**
 *
 * @author gabri
 */
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gerente1", "123", 5000.0);
        Assistente assistente = new Assistente("Assistente1", "456", 3000.0);
        Vendedor vendedor = new Vendedor("Vendedor1", "789", 2500.0, 500.0);

        System.out.println("Salário do Gerente: " + gerente.calculaSalario());
        System.out.println("Salário do Assistente: " + assistente.calculaSalario());
        System.out.println("Salário do Vendedor: " + vendedor.calculaSalario());
    }
}
