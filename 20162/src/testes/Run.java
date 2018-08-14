package testes;


import singletonInstancias.Nton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LEESE
 */
public class Run {
      public static void main(String[] args){
            Nton.initialize(3, 5); 
            // No mínimo três e no máximo cinco instâncias
            // Três news já devem ocorrer nesta linha
            Nton i1 = Nton.getInstance(); 
            // Obtém a 1a instância (sem new)
            Nton i2 = Nton.getInstance(); 
        // Obtém a 2a instância (sem new)
            Nton i3 = Nton.getInstance(); 
        // Obtém a 3a instância (sem new)
            Nton i4 = Nton.getInstance(); 
        // Obtém a 4a instância (com new)
            Nton i5 = Nton.getInstance(); 
        // Obtém a 5a instância (com new)
            Nton i6 = Nton.getInstance();
            // Obtém a 1a instância
            //if (i6 == i1) System.out.println(“OK”);
            // Deve exibir “OK”
            Nton i7 = Nton.getInstance(); 
        // Obtém a 2a instância
            //if (i7 == i2) System.out.println(“OK”); 
           
      }
}
