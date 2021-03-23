/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author dani
 */
public class BotonPanel extends JPanel{
    private JButton btn;
    
    public BotonPanel(){
        super.setBackground(Color.PINK);
        
        this.btn = new JButton("Calcular");
        
        super.add(this.btn);        
    }

    public JButton getBtn() {
        return btn;
    }
    
    
}
