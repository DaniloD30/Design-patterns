/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

/**
 *
 * @author LEESE
 */
public class EditorFramework implements MyFramework{
    private IFactory creator;
    
    @Override
    public void setCreator(IFactory creator){
        this.creator = creator;
    }
    
    @Override
    public void fileOpen(){
        IDocument doc = this.creator.create();
        doc.info();
    }
}
