/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.notificacao.model;

public class Email extends Notificacao {

    public Email(String destinatario,String mensagem) {
        super(destinatario,mensagem,TipoNotificacao.EMAIL);
    }

    @Override
    public void enviar() {
        System.out.println("----- EMAIL -----");
        System.out.println("Destino: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}