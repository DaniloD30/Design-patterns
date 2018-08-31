/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.app;

import bridge.interfaces.IVideo;
import bridge.products.Codec1;
import bridge.products.Codec2;
import bridge.products.Video1;
import decorator.interfaces.IComponent;
import decorator.interfaces.PropagandaAntes;
import decorator.interfaces.PropagandaDepois;

/**
 *
 * @author LEESE
 */
public class Run {

    public static void main(String[] args) {
        IVideo video1 = new Video1();
        video1.setCodec(new Codec2());
        IComponent videoComPropaganda = new PropagandaAntes(new PropagandaDepois((IComponent) video1));
        videoComPropaganda.play();

    }
}
