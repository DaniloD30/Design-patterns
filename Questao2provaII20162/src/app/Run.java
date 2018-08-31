/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.lang.annotation.Target;

/**
 *
 * @author LEESE
 */
public class Run {
    public static void main(String[] args) {
       Adaptee adaptee = new Adaptee();
       Adapter adaptador = new Adapter(adaptee);
        adaptador.mover(1,2);
        //EntradaPS2 ps2 = new EntradaPS2();
        //AdapterEntrada adaptador = new AdapterEntrada(ps2);
        //adaptador.conectarEntradaUSB();
    }
}
