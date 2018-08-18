/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import interfaces.IMotor;
import interfaces.IPrototype;

/**
 *
 * @author LEESE
 */
public class Motor implements IMotor, IPrototype{

    @Override
    public IPrototype clonar() {
        return (this);
    }
    
}
