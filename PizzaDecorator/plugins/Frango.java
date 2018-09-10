/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import interfaces.Decorator;
import interfaces.IComponent;

/**
 *
 * @author Aluno
 */
public class Frango extends Decorator {

   public Frango(IComponent d) throws Exception{
        super(d);
    }
    
   @Override
    public void makePizza(){
        super.makePizza();
        System.out.println("Inserindo frango como ingrediente da pizza");
    }
    
}
