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
public class PropagandaDepois extends IAbstractDecorator{

    public PropagandaDepois(IComponent component) {
        super(component);
    }

    @Override
    public void play() {
         c.play();
         exibirPropaganda();
    }
    
    public void exibirPropaganda(){
        System.out.println("Propaganda depois");
    }
    
}
