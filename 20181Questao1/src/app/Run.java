/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import factory.MyFactory;
import interfaces.IPneu;

/**
 *
 * @author LEESE
 */
public class Run {

    public static void main(String args[]) {
        MyFactory f = MyFactory.getInstance();
        f.addPrototype("Pneu", 2, 4); // 2 = número mínimo de pneus, enquanto 4 é o número máximo
        IPneu m1 = f.create("Pneu"); // Retorna a 1a instância, já criada
        IPneu m2 = f.create("Pneu"); // Retorna a 2a instância, já criada
        IPneu m3 = f.create("Pneu"); // Realiza a 1a instanciação (3o pneu)
        IPneu m4 = f.create("Pneu"); // Realiza a 2a instanciação (4o pneu)
        IPneu m5 = f.create("Pneu"); // Deve retornar o primeiro pneu

    }
}
