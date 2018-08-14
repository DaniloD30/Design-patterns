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
    private  static  List<Nton> lista = new ArrayList<>();
    private  static int min;
    private  static int max;
    private static Nton instance ;
    private  static int count=0;
    
    private Nton(){}
    
    public static void initialize(int min, int max){
        Nton.min = min; 
        Nton.max = max;
        for(int i=0;i<min;i++){
            Nton.lista.add(new Nton());// cria as 3 intancias e deixa a lista com 3 posições
        }
    }
    
    public static int getSize(){
        return Nton.lista.size();
    }
    
    public static Nton getInstance(){
       if(Nton.count < Nton.min){
           return Nton.lista.get(Nton.count++);
        }
        if(Nton.count < Nton.max){
            Nton.lista.add(new Nton());
            Nton.count = Nton.getSize(); 
            return Nton.lista.get(Nton.count-1);
        }
        if((Nton.count) == Nton.max){
             Nton.count = 0;
        }
        return Nton.lista.get(count++);
    }
    

   

    
    
    
}
