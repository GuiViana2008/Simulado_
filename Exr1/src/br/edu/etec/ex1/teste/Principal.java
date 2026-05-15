/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex1.teste;

import br.edu.etec.ex1.model.Computador;
import br.edu.etec.ex1.model.TipoEquipamento;

public class Principal {
    
    public static void main(String [] args){
        
        Computador computador = new Computador("Dell", "Inspiron", TipoEquipamento.COMPUTADOR, "Intel i5");
        computador.exibirDados();
    }
}
