/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import interfaces.IPrototype;
import java.util.HashMap;

/**
 *
 * @author LEESE
 */
public class FlexibleFactory {
    private HashMap<String, IPrototype> prototypes;
    
    public FlexibleFactory(){
        this.prototypes = new HashMap<>();
    }
    
    public IPrototype create(String name){
        if(this.prototypes.containsKey(name)){
            return this.prototypes.get(name).clonar();
        }
        return null;
    }
    
    public void addPrototype(String name, IPrototype proto){
        if(!this.prototypes.containsKey(proto))
            this.prototypes.put(name, proto);
    }
}
