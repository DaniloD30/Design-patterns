/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import factory.MyFactory;
import interfaces.IMotor;

/**
 *
 * @author LEESE
 */
public class Run {
    public static void main(String args[]){
        MyFactory f = MyFactory.getInstance(4, 3, 2); 
        IMotor m1 = f.createMotor(); 
        IMotor m2 = f.createMotor(); 
        IMotor m3 = f.createMotor(); 
        IMotor m4 = f.createMotor(); 
       
    }
}
