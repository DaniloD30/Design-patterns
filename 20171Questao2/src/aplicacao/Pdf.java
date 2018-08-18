/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import framework.IDocument;

/**
 *
 * @author LEESE
 */
public class Pdf implements IDocument {

    @Override
    public void info() {
        System.out.println("Documento pdf");
    }
    
}
