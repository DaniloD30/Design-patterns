/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import interfaces.AbstractMovel;
import products.Cadeira;
import products.FerramentaBarata;
import products.FerramentaCara;
import products.Mesa;

/**
 *
 * @author LEESE
 */
public class Run {
    public static void main(String args[]){
        AbstractMovel movel = new Mesa(new FerramentaBarata());
        movel.construir();
        movel = new Cadeira(new FerramentaCara());
        movel.construir();
    }
}
