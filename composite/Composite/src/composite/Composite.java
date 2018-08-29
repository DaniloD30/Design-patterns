/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import interfaces.Component;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Composite extends Component {
    private List<Component> list;
    
    public Composite(){
        this.list = new ArrayList<>();
    }
    
    @Override
    public void addComponent(Component component) {
       if(!list.contains(component)){
           this.list.add(component);
       }
    }

    @Override
    public void removeComponent(Component component) {
        if(list.contains(component)){
            this.list.remove(component);
        }
    }

    @Override
    public Component getChild(int i) {
        if(!this.list.isEmpty()){
            if(i < this.list.size()+1)
                return this.list.get(i);
        }
        return null;
    }

    @Override
    public void aumentarPreco(double p) {
        for(Component c : list)
            c.aumentarPreco(p);
    }
    
}
