/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import interfaces.ISerializable;
import interfaces.IPrototype;

/**
 *
 * @author LEESE
 */
public class Motor implements ISerializable, IPrototype {

    @Override
    public ISerializable clonar() {
        return new Motor();
    }
    
}
