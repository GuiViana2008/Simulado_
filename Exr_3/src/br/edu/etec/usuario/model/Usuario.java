/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.usuario.model;

public class Usuario {

    private String login;
    private String senha;
    private NivelAcesso nivel;
    private boolean ativo;

    public Usuario(String login,String senha,NivelAcesso nivel) {
        setLogin(login);
        this.senha = senha;
        setNivel(nivel);
        this.ativo = true;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public NivelAcesso getNivel() {
        return nivel;
    }

    public void setNivel(NivelAcesso nivel) {
        this.nivel = nivel;
    }

    public boolean autenticar(String senha) {

        if(this.senha.equals(senha) && ativo) {
            return true;
        }

        return false;
    }

    public void desativar() {
        ativo = false;
    }
}
