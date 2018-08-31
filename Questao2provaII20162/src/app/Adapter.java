package app;


import app.Adaptee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LEESE
 */
public class Adapter implements Target {

    private Adaptee moverAdaptee;
    
    public Adapter(Adaptee m) {
        this.moverAdaptee = m;
    }

    //Solicitação
    @Override
    public void mover(int x, int y) {
        System.out.println("Adaptando...");
        moverAdaptee.mover(x, y);
    }
}
