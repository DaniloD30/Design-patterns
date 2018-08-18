/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import interfaces.IPneu;
import interfaces.IPrototype;

/**
 *
 * @author LEESE
 */
public class Pneu implements IPneu, IPrototype {
    private String name;
    
    @Override
    public IPrototype clonar() {
        return (this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
