/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import composite.Composite;
import interfaces.IComponent;
import leafs.Fruta;

/**
 *
 * @author qt
 */
public class main {

    public static void main(String[] args) throws Exception {
        IComponent todasAsFrutas = new Composite();
        
        IComponent cajus = new Composite(todasAsFrutas); // todasasfrutas.list = cajus;
        IComponent cajusVerdes = new Composite(cajus); // cajus.list = cajusverdes
        IComponent cajusVerdesPequenos = new Composite(cajusVerdes); //cajusverdes.list = cajusverdespequenos
        Fruta caju = new Fruta(cajusVerdesPequenos, "Caju", "Pequeno", "Verde"); //cajusVerdesPequenos.list = caju
        
        IComponent laranjas = new Composite(todasAsFrutas);
        IComponent laranjasMadura = new Composite(laranjas);
        IComponent laranjasMadurasGrandes = new Composite(laranjasMadura);
        Fruta laranja = new Fruta(laranjasMadurasGrandes, "Laranja", "Grande", "Madura");
        
        //IComponent cajusVerdesPequenos = new Composite("Caju", "Pequeno", "Verde", 3);
        //Fruta laranja = new Fruta("Laranja", "Pequena", "Madura");
        //Fruta maça = new Fruta("Maça", "Grande", "Verde");
        
        /*
        cajusVerdesPequenos.addComponent(caju);
        cajusVerdes.addComponent(cajusVerdesPequenos);
        cajus.addComponent(cajusVerdes);
        todasAsFrutas.addComponent(cajus);
        */
        todasAsFrutas.removeAll();
        todasAsFrutas.realizarLimpeza();
       // todasAsFrutas.getChild(1).realizarLimpeza();
        System.out.println("");
        cajusVerdesPequenos.realizarLimpeza();
        
        //frutas.addComponent(cajusVerdesPequenos);
        //frutas.addComponent(laranja);
        //frutas.addComponent(maça);

        //frutas.realizarLimpeza();
        //frutas.getChild(0).realizarLimpeza();
        //cajusVerdesPequenos.realizarLimpeza();

    }
}
