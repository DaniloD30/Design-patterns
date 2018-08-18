/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import singleton.Nton;

/**
 *
 * @author LEESE
 */
public class Run {
    public static void main(String args[]){
        Nton.initialize(3); // No máximo três instâncias serão criadas
        Nton i1 = Nton.getInstance(); 
        // Obtém a 1a instância
        Nton i2 = Nton.getInstance();
        // Obtém a 2a instância
        Nton i3 = Nton.getInstance();
        // Obtém a 3a instância
        Nton i4 = Nton.getInstance();
        // Obtém a 1a instância
        if (i4 == i1) System.out.println("OK"); 
        // Deve exibir “OK” 
        Nton i5 = Nton.getInstance(); 
        // Obtém a 2a instância 
        if (i5 == i2) System.out.println("OK"); 
        System.out.println(i4);
        System.out.println(i1);
    }
}
