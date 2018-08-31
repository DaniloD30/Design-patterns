/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.products;

import bridge.interfaces.ICodec;

/**
 *
 * @author LEESE
 */
public class Codec2 implements ICodec {

    @Override
    public void vizualizar() {
        System.out.println("Exibindo video com codec 2");
    }
    
}
