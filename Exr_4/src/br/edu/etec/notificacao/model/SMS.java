/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.notificacao.model;

public class SMS extends Notificacao {

    public SMS(String destinatario,String mensagem) {
        super(destinatario,mensagem,TipoNotificacao.SMS);
    }

    @Override
    public void enviar() {
        if(mensagem.length() > 160) {
            mensagem = mensagem.substring(0, 160);
        }

        System.out.println("----- SMS -----");
        System.out.println("Destino: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
