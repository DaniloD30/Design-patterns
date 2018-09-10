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
public class Calabresa extends Decorator{
    
    public Calabresa(IComponent d) throws Exception{
        super(d);
    }
    
    @Override
    public void makePizza(){
        super.makePizza();
        System.out.println("Inserindo calabresa como ingrediente da pizza");
    }

   
    
}
