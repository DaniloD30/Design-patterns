/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import factory.FlexibleFactory;
import products.Motor;
import products.Pneu;

/**
 *
 * @author LEESE
 */
public class Run {
     public static void main(String[] args){
        FlexibleFactory ff = new FlexibleFactory(); 
        ff.addPrototype("Mergeable", "Pneu", new Pneu()); 
        ff.addPrototype("Serializable", "Motor", new Motor()); 
        Pneu p = (Pneu) ff.createMergeable("Pneu"); 
        Motor m = (Motor) ff.createSerializable("Motor");
        
    }
}
