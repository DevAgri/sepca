/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devagri3;

import br.com.devagri3.dao.Conecta;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author willyan
 */
public class BrComDevagri3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Conecta.conectabd();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BrComDevagri3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
