/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author dani
 */
public class Menu extends JMenuBar{
    private JMenu mn1;
    private JMenu mn2;
    private JMenuItem mnItm1Crear;
    private JMenuItem mnItm1Borrar;
    private JMenuItem mnItm2Colores;
    private JMenuItem mnItm2Fuente;
    
    
    public Menu(){
        super.setBackground(Color.BLUE);
        
        
        mn1 = new JMenu("Archivo");
        mn2 = new JMenu("Opciones");
        
        mnItm1Crear = new JMenuItem("Crear");
        mnItm1Borrar = new JMenuItem("Borrar");
        
        mnItm2Colores = new JMenuItem("Colores");
        mnItm2Fuente = new JMenuItem("Fuente");
        
        mn2.add(mnItm2Colores);
        mn2.add(mnItm2Fuente);
        
        mn1.add(mnItm1Borrar);
        mn1.add(mnItm1Crear);
        
        super.add(this.mn1);
        super.add(this.mn2);
        
    }
    
}
