/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

//import core.DbController;
//import core.PluginController;
//import core.UiController;

/**
 *
 * @author LEESE
 */
public interface ICore {
    IuiController getUiController();
    IdbController getDbController();
    IPluginController getPluginController();
    
}
