/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.pagamento.model;

public abstract class Pagamento {

    private double valor;
    protected StatusPagamento status;

    public Pagamento(double valor) {
        setValor(valor);
        this.status = StatusPagamento.PENDENTE;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public StatusPagamento getStatus() {
        return status;
    }

    public abstract void processarPagamento();

    public void exibirStatus() {
        System.out.println("Status: " + getStatus());
    }
}
