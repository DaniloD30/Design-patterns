/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author LEESE
 */
public abstract class AbstractMovel {
    protected IFerramentas ferramenta;
    
    public AbstractMovel(IFerramentas f){
        this.ferramenta = f;
    }
    
    public abstract void construir();
}
