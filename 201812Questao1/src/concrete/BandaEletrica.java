/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

import interfaces.IBanda;

/**
 *
 * @author LEESE
 */
public class BandaEletrica implements IBanda {

    @Override
    public void tocarBateria() {
        System.out.println("Tocando bateria na banda eletrica");
    }

    @Override
    public void tocarGuitarra() {
        System.out.println("Tocando guitarra na banda eletrica");
    }

    @Override
    public void tocarBaixo() {
        System.out.println("Tocando baixo na banda eletrica");
    }
}
