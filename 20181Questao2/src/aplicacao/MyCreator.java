/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import framework.IFactoryMethod;
import framework.IObjetivo;

/**
 *
 * @author LEESE
 */
public class MyCreator implements IFactoryMethod {

    @Override
    public IObjetivo create() {
        return new Serializador();
    }

}
