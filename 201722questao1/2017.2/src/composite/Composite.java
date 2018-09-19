/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import interfaces.IComponent;
import java.util.ArrayList;
import java.util.List;
import leafs.Fruta;

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

    /*
    public Composite(String n, String t, String m, int qtd){
        list = new ArrayList<>();
        for(int i=0;i<qtd;i++)
            list.add(new Fruta(n, t, m));
    }
     */
    @Override
    public void realizarLimpeza() {
        if (!list.isEmpty()) {
            list.forEach((c) -> {
                c.realizarLimpeza();
            });
        } else {
            System.out.println("Nenhuma fruta para limpeza");
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
    
    public void removelAll(){
        for(IComponent c: list){
            removeComponent(c);
        }
        
      
    }
    
    private List<IComponent> list;
}
