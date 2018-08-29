/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaf;

import interfaces.Component;

/**
 *
 * @author Aluno
 */
public class Arroz extends Component {
    private double preco;
    
    @Override
    public void aumentarPreco(double p) {
        this.preco += p;
        System.out.println("Aumentado preco arroz  " + this.preco);
    }

}
