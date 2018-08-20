package singletonInstancias;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LEESE
 */
public class Nton {
    List<Nton> lista;
    private int min;
    private int max;
    private static Nton instance ;
    private int count=0;
    
    private Nton(){
        this.lista = new ArrayList<>();
    }package singletonInstancias;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LEESE
 */
public class Nton {
     private Nton(){}
   
     public static void initialize(int min, int max){
        Nton.min = min;
        Nton.max = max;
        Nton.instancias = new ArrayList<>();
        for(int i=0;i<min;i++){
            Nton.instancias.add(new Nton());
        }
    }
    
    public static Nton getInstance(){
        if(Nton.count < Nton.min)
            return Nton.instancias.get(count++);
        if(Nton.instancias.size() < Nton.max){
            Nton.instancias.add(new Nton());
            Nton.count = Nton.instancias.size();
            return Nton.instancias.get(Nton.instancias.size()-1);
        }
        if(Nton.count == Nton.max)
            Nton.count = 0;
        return Nton.instancias.get(Nton.count++);
    }
    
    private static int max;
    private static int min;
    private static List<Nton> instancias;
    private static int count = 0;

    
    
    
}
