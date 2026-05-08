/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.zoologico.teste;

import br.edu.etec.zoologico.model.Animal;
import br.edu.etec.zoologico.model.Arara;
import br.edu.etec.zoologico.model.Golfinho;
import br.edu.etec.zoologico.model.Leao;

public class TesteZoologico {

    public static void main(String[] args) {
        
        Animal leao = new Leao("Simba", 5);
        System.out.println("----- LEÃO -----");
        leao.exibirInfo();
        leao.emitirSom();
        
        Animal golfinho = new Golfinho("Flipper", 3);
        System.out.println("----- GOLFINHO -----");
        golfinho.exibirInfo();
        golfinho.emitirSom();
        
        Animal arara = new Arara("Azul", 2);
        System.out.println("----- ARARA -----");
        arara.exibirInfo();
        arara.emitirSom();
    }
}
