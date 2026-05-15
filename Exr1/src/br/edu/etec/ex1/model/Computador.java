/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex1.model;

public class Computador extends Equipamento {
    
    private String processador;

    public Computador(String nome, String modelo, TipoEquipamento tipo , String processador) {
        super(nome, modelo, tipo);
        this.processador = processador;
    }

    public String getProcessador() {
        return processador;
    }
    
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Processador: " + processador);
    }
}
