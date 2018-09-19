/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import composite.Composite;
import interfaces.IComponent;
import leafs.InstrumentoMusical;

/**
 *
 * @author LEESE
 */
public class Run {

    public static void main(String[] args) {
        IComponent orquestra = new Composite();

        //CORDAS
        IComponent cordas = new Composite(orquestra);
        IComponent violino = new Composite(cordas);
        InstrumentoMusical v1 = new InstrumentoMusical(violino, "Violino 1");
        InstrumentoMusical v2 = new InstrumentoMusical(violino, "Violino 2");

        IComponent violoncelo = new Composite(cordas);
        InstrumentoMusical violoncelo1 = new InstrumentoMusical(violoncelo, "Violoncelo 1");
        InstrumentoMusical violoncelo2 = new InstrumentoMusical(violoncelo, "Violoncelo 2");

        //PERCUSSAO
        IComponent percussao = new Composite(orquestra);
        IComponent xilofone = new Composite(percussao);
        InstrumentoMusical x1 = new InstrumentoMusical(xilofone, "Xilofone 1");
        InstrumentoMusical x2 = new InstrumentoMusical(xilofone, "Xilofone 2");

        IComponent timpanos = new Composite(percussao);
        InstrumentoMusical timpano1 = new InstrumentoMusical(timpanos, "Timpanos 1");
        InstrumentoMusical timpano2 = new InstrumentoMusical(timpanos, "Timpanos 2");

        //SOPRO
        IComponent sopro = new Composite(orquestra);
        IComponent trompete = new Composite(sopro);
        InstrumentoMusical trompete1 = new InstrumentoMusical(trompete, "Trompete 1");
        InstrumentoMusical trompete2 = new InstrumentoMusical(trompete, "Trompete 2");

        IComponent saxofone = new Composite(sopro);
        InstrumentoMusical saxofone1 = new InstrumentoMusical(saxofone, "Saxofone 1");
        InstrumentoMusical saxofone2 = new InstrumentoMusical(saxofone, "Saxofone 2");

        orquestra.afinarInstrumento();
        cordas.tocarInstrumento();
        percussao.tocarInstrumento();
        sopro.tocarInstrumento();
        timpano1.tocarInstrumento();

    }
}
