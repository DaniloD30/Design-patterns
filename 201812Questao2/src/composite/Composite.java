/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import interfaces.IComponent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author qt
 */
public class Composite extends IComponent {

    public Composite() {
        list = new ArrayList<>();
    }

    public Composite(IComponent pai) {
        list = new ArrayList<>();
        pai.addComponent(this);
    }

    @Override
    public void afinarInstrumento() {
        if (!list.isEmpty()) {
            list.forEach((c) -> {
                c.afinarInstrumento();
            });
        } else {
            System.out.println("Nenhum instrumento para afinar");
        }

    }

    @Override
    public void addComponent(IComponent component) {
        if (!list.contains(component)) {
            list.add(component);
        }
    }

    @Override
    public void removeComponent(IComponent component) {
        if (list.contains(component)) {
            list.remove(component);
        }
    }

    @Override
    public IComponent getChild(int i) {
        return list.get(i);
    }

    @Override
    public void tocarInstrumento() {
        if (!list.isEmpty()) {
            list.forEach((c) -> {
                c.tocarInstrumento();
            });
        } else {
            System.out.println("Nenhum instrumento para tocar na orquestra");
        }
    }

    private List<IComponent> list;

}
