/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.interfaces;

/**
 *
 * @author LEESE
 */
public class PropagandaAntes extends IAbstractDecorator {

    public PropagandaAntes(IComponent component) {
        super(component);
    }

    @Override
    public void play() {
        exibirPropaganda();
        c.play();
    }
    
    public void exibirPropaganda(){
        System.out.println("Propaganda antes");
    }
    
}
