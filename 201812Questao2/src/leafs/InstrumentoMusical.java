/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leafs;

import interfaces.IComponent;

/**
 *
 * @author LEESE
 */
public class InstrumentoMusical extends IComponent {

    public InstrumentoMusical(IComponent p, String n) {
        nome = n;
        p.addComponent(this);
    }

    @Override
    public void afinarInstrumento() {
        System.out.println("Afinando instrumento " + nome);
    }

    @Override
    public void tocarInstrumento() {
        System.out.println("Tocando instrumento " + nome);
    }
    
    private String nome;
    private IComponent pai;

}
