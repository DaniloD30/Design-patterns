/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import interfaces.IAbstractFactory;
import interfaces.IPneu;
import java.util.HashMap;
import products.Pneu;

/**
 *
 * @author LEESE
 */
public class MyFactory implements IAbstractFactory {

    private MyFactory() {
        this.pneus = new HashMap<>();
        this.pneusPosition = new HashMap<>();
    }

    public static MyFactory getInstance() {
        if (MyFactory.instance == null) {
            MyFactory.instance = new MyFactory();
        }
        return MyFactory.instance;
    }

    public void addPrototype(String name, int min, int max) {
        this.min = min;
        this.max = max;
        if (!this.pneus.containsKey(name)) {
            for (int i = 0; i < min; i++) {
                IPneu p = new Pneu();
                this.pneus.put(name, p);
                this.pneusPosition.put(i, p);
            }
        } else {
            System.out.println("Produto não adicionado na lista");
        }
    }

    public IPneu create(String name) {
        if (this.count == this.max) {
            this.count = 0;
        }
        if (this.pneus.containsKey(name)) {
            if (this.count < this.min) {
                return this.pneusPosition.get(this.count++).clonar(); // 2
            } else {
                if (this.count < this.max) {
                    IPneu p = new Pneu();
                    this.pneus.put(name, p);
                    this.pneusPosition.put(this.count, p);
                    return this.pneusPosition.get(this.count++).clonar();
                }
            }

        }
        return null;
    }

    private static MyFactory instance = null;

    private HashMap<String, IPneu> pneus;
    private HashMap<Integer, IPneu> pneusPosition;

    private int min;
    private int max;

    private int count = 0;
}
