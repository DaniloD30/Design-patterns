/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leafs;

import interfaces.IComponent;

/**
 *
 * @author qt
 */
public class Fruta extends IComponent {

    public Fruta(IComponent p, String n, String t, String m) {

        nome = n;
        tamanho = t;
        maturidade = m;
        p.addComponent(this);

    }

    @Override
    public void realizarLimpeza() {
        System.out.println("Realizando limpeza no " + nome + " com tamanho " + tamanho + " e grau de maturidade " + maturidade);
    }

    private String nome;
    private String tamanho;
    private String maturidade;
    private IComponent pai;

}
