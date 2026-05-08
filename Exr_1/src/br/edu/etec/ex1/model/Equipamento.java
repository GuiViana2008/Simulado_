/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex1.model;

public class Equipamento {
    private String nome;
    private String modelo;

    public Equipamento(String nome, String modelo) {
        setNome(nome);
        setModelo(modelo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    public void exibirDados(){
        System.out.println("-----  Equipamento -----");
        System.out.println("Nome: " + getNome());
        System.out.println("Modelo: " + getModelo());
    }
}
