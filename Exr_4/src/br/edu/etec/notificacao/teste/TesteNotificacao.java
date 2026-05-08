/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.notificacao.teste;

import br.edu.etec.notificacao.model.Email;
import br.edu.etec.notificacao.model.Notificacao;
import br.edu.etec.notificacao.model.SMS;

public class TesteNotificacao {

    public static void main(String[] args) {
        Notificacao[] notificacoes = {
            new Email("email@gmail.com","Bem-vindo ao sistema!"),
            new SMS("11999999999", "Mensagem enviada por SMS."
            )
        };
        for(Notificacao n : notificacoes) {
            n.preparar();
            n.enviar();
        }
    }
}
