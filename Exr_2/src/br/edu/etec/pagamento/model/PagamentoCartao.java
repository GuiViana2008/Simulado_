/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.pagamento.model;

public class PagamentoCartao extends Pagamento {

    private String numeroCartao;

    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor);
        setNumeroCartao(numeroCartao);
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        status = StatusPagamento.PROCESSANDO;
        String ultimos4 = numeroCartao.substring(numeroCartao.length() - 4);
        System.out.println("Processando pagamento...");
        System.out.println("Cartão final: " + ultimos4);
        status = StatusPagamento.CONCLUIDO;
    }
}