/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import interfaces.AbstractMovel;
import interfaces.IFerramentas;

/**
 *
 * @author LEESE
 */
public class Cadeira extends AbstractMovel {

    public Cadeira(IFerramentas f) {
        super(f);
    }

    @Override
    public void construir() {
        ferramenta.lixar();
        ferramenta.prender();
        ferramenta.serrar();
        System.out.println("Construindo cadeira");
    }

}
