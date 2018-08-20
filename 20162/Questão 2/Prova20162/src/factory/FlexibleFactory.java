/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import interfaces.IMergeable;
import interfaces.IPrototype;
import interfaces.ISerializable;
import java.util.HashMap;

/**
 *
 * @author LEESE
 */
public class FlexibleFactory {
    
     public FlexibleFactory(){
        this.hashMergeable = new HashMap<>();
        this.hashSerializable = new HashMap<>();
    }
    
    public IMergeable createMergeable(String name){
        if(this.hashMergeable.containsKey(name)){
            return this.hashMergeable.get(name).clonar();
        }
        return null;
    }
     public ISerializable createSerializable(String name){
        if(this.hashSerializable.containsKey(name)){
            return this.hashSerializable.get(name).clonar();
        }
        return null;
    }
    public void addPrototype(String nameType, String name,IPrototype proto){
        if(nameType.equalsIgnoreCase("Serializable"))
            if(!this.hashSerializable.containsKey(name))
                this.hashSerializable.put(name,(ISerializable) proto);
        if(nameType.equalsIgnoreCase("Mergeable"))
            if(!this.hashMergeable.containsKey(name))
                this.hashMergeable.put(name,(IMergeable) proto);
         
    }
     private HashMap<String,IMergeable> hashMergeable;
     private HashMap<String,ISerializable> hashSerializable;
}
