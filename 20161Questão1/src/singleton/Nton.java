/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEESE
 */
public class Nton {
    
    private Nton(){}
    
    public static void initialize(int max){
        Nton.instancias = new ArrayList<>();
        Nton.max = max;
    }
    
    public static Nton getInstance(){
        if(Nton.instancias.size() < Nton.max){
            Nton.instancias.add(new Nton());
            Nton.instancias.get(Nton.instancias.size()-1);
        }
        if(Nton.count == Nton.max)
            Nton.count = 0;
        return Nton.instancias.get(Nton.count++);
    }
    
    private static int max;
    private static List<Nton> instancias; 
    private static int count=0;
}
