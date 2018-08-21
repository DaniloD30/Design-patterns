/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import aplicacao.MyCreator;
import aplicacao.MyFramework;

/**
 *
 * @author LEESE
 */
public class Run {
    public static void main(String args[]) {
        MyFramework f = new MyFramework();
        f.setCreator(new MyCreator());
        f.serialize();
    }

}
