/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import interfaces.IFerramentas;

/**
 *
 * @author LEESE
 */
public class FerramentaCara implements IFerramentas {

    @Override
    public void serrar() {
        System.out.println("Serrando com ferramenta cara");
    }

    @Override
    public void lixar() {
        System.out.println("Lixando com ferramenta cara");
    }

    @Override
    public void prender() {
        System.out.println("Prendendo com ferramenta cara");
    }

}
