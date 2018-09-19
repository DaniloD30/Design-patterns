/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

import interfaces.IBanda;
import interfaces.IMusica;

/**
 *
 * @author LEESE
 */
public class Arrocha extends IMusica {

    public Arrocha(IBanda b) {
        super(b);
    }

    @Override
    public void play() {
        System.out.println("");
        System.out.println("Tocando musica de arrocha");
        banda.tocarBateria();
        banda.tocarGuitarra();
        banda.tocarBaixo();

    }

}
