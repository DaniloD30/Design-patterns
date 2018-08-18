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
    public static void main(String args[]){
        FlexibleFactory ff = new FlexibleFactory(); 
        Pneu pp = new Pneu();
        pp.setName("xxx");
        ff.addPrototype("Pneu", pp); 
        ff.addPrototype("Motor", new Motor()); 
        Pneu p = (Pneu) ff.create("Pneu"); 
         System.out.println(p.getName());
        Motor m = (Motor) ff.create("Motor"); 
        if (ff.create("Chassi") == null) 
            System.out.println("NULL"); // Deve exibir NULL

    }
}
