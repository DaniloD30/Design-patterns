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
    }
    
    public void initialize(int min, int max){
        this.min = min; 
        this.max = max;
        for(int i=0;i<this.min;i++){
            lista.add(new Nton());
        }
    }
   public static Nton getInstance(){
        if(lista.size() < this.max){
            lista.add(new Nton());
            return lista.get(lista.size());
            //return new Nton();
        }
        if(this.count  == this.max){
            this.count = 0;
        }
        return lista.get(count++);
    }
    

   

    
    
    
}
