/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.usuario.teste;

import br.edu.etec.usuario.model.NivelAcesso;
import br.edu.etec.usuario.model.Usuario;

public class TesteUsuario {

    public static void main(String[] args) {
        Usuario admin =new Usuario("guilherme", "1234",NivelAcesso.ADMIN);
        boolean autenticado = admin.autenticar("1234");
        System.out.println("Autenticado: " + autenticado);
        System.out.println("Nível: " + admin.getNivel());
    }
}
