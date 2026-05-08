/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex1.model;

public class Computador extends Equipamento {
    
    private String processador;

    public Computador(String processador, String nome, String modelo) {
        super(nome, modelo);
        this.processador = processador;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("-----  Equipamento -----");
        System.out.println("Nome: " + getNome());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Processador: " + getProcessador());
    }
}
