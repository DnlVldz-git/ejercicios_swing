/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author dani
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalcularAction implements ActionListener{
    private JTextField num1;
    private JTextField num2;
    
    public CalcularAction(Integer i, Integer i2){
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
       JOptionPane.showMessageDialog(null, ("El resultado es: "+(Integer.valueOf(this.num1.getText())+(Integer.valueOf(this.num2.getText())))));
    }
    
}
