/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import composite.Composite;
import leaf.Arroz;
import leaf.Camisa;
import leaf.Feijao;
import leaf.Tenis;

/**
 *
 * @author Aluno
 */
public class Run {

    public static void main(String args[]) {
        
        Composite vestuario = new Composite();
        Composite alimenticio = new Composite();
        Composite mercado = new Composite();
        
        Arroz arroz = new Arroz();
        arroz.aumentarPreco(2.5);
        
        Feijao feijao = new Feijao();
        feijao.aumentarPreco(5.0);
        
        Camisa camisa = new Camisa();
        camisa.aumentarPreco(20.0);
        
        Tenis tenis = new Tenis();
        tenis.aumentarPreco(200.0);
        
        vestuario.addComponent(tenis);
        vestuario.addComponent(camisa);
        
        alimenticio.addComponent(arroz);
        alimenticio.addComponent(feijao);
        
        vestuario.getChild(1).aumentarPreco(10.0);
        vestuario.aumentarPreco(100.0);
        
        alimenticio.aumentarPreco(10.0);
        alimenticio.getChild(1).aumentarPreco(0.50);
        
        mercado.addComponent(vestuario);
        mercado.addComponent(alimenticio);
        mercado.aumentarPreco(1.0);

    }
}
