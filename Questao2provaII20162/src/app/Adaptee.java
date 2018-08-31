package app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LEESE
 */
public class Adaptee {
    private int x;
    private int y;
    
    public void mover(int deltaX, int deltaY){
        System.out.println("Movendo adaptee");
    }
    
    public int getX(){
        return this.x;
    } 
    public int getY(){
        return this.y;
    }

}
