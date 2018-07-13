/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
//import interfaces.ICore;

import interfaces.ICore;
import interfaces.IPluginController;
import interfaces.IdbController;
import interfaces.IuiController;

/**
 *
 * @author LEESE
 */
public class Core implements ICore{
    
    private IuiController uiController;
    private IdbController dbController;
    private IPluginController pluginController;
    
    public Core(){
        uiController = new UiController();
        dbController = new DbController();
        pluginController = new PluginController();
    }
    @Override
    public IuiController getUiController() {
        return uiController;
    }

    @Override
    public IdbController getDbController() {
         return dbController;
       
    }

    @Override
    public IPluginController getPluginController() {
        return pluginController;
    }

    
}
