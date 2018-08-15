/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;


import interfaces.IPrototype;
import interfaces.IMergeable;


/**
 *
 * @author LEESE
 */
public class Pneu implements IMergeable, IPrototype {

    @Override
    public IMergeable clonar() {
        return new Pneu();
    }

    
   
    
}
