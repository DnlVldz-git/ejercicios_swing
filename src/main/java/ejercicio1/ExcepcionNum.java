/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class ExcepcionNum extends Exception{
    public ExcepcionNum(String msg){
        super(msg);
        JOptionPane.showMessageDialog(null, ("Qué buen dato me diste, pero no es válido"));
    }
        
}
