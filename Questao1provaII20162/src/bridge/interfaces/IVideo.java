/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.interfaces;

/**
 *
 * @author LEESE
 */
public abstract class IVideo {
    protected ICodec codec;
    
    public void setCodec(ICodec c){
        this.codec = c;
    }
    
    public abstract void play();
}
