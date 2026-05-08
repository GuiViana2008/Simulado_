/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.pagamento.teste;

import br.edu.etec.pagamento.model.PagamentoCartao;

public class TestePagamento {

    public static void main(String[] args) {
        PagamentoCartao p1 =  new PagamentoCartao(300.0, "1234567890123456");
        p1.exibirStatus();
        p1.processarPagamento();
        p1.exibirStatus();
    }
}
