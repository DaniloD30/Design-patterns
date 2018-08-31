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
public abstract class IAbstractDecorator implements IComponent {
    protected IComponent c;
    
    public IAbstractDecorator(IComponent component){
        this.c = component;
    }
    
}
