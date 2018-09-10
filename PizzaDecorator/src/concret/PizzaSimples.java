/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concret;

import interfaces.IComponent;

/**
 *
 * @author Aluno
 */
public class PizzaSimples implements IComponent {

    @Override
    public String makePizza() {
      return "Preparando pizza simples";
    }
    
}
