/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import framework.IFactoryMethod;
import framework.IFramework;
import framework.IObjetivo;

/**
 *
 * @author LEESE
 */
public class MyFramework implements IFramework {

    @Override
    public void setCreator(IFactoryMethod creator) {
        this.creator = creator;
    }

    @Override
    public void serialize() {
        this.objetivo = creator.create();
        System.out.println("Serializando dados no disco");
    }

    private IFactoryMethod creator;
    private IObjetivo objetivo;
}
