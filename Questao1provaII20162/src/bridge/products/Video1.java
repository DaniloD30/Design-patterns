/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.products;

import bridge.interfaces.IVideo;
import decorator.interfaces.IComponent;

/**
 *
 * @author LEESE
 */
public class Video1 extends IVideo implements IComponent{

    @Override
    public void play() {
        System.out.println("Exibindo video1");
        codec.vizualizar();
    }
    
}
