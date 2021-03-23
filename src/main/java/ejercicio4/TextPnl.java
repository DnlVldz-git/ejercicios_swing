/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dani
 */
public class TextPnl extends JPanel{
    private JTextField txtFld1;
    private JTextField txtFld2;
    private JLabel lbl1;
    private JLabel lbl2;
    private JButton btn;
    
    public TextPnl(){
        super.setBackground(Color.PINK);
        
        this.txtFld1 = new JTextField(15);
        this.txtFld2 = new JTextField(15);
        
        this.lbl1 = new JLabel("Introduzca el título");
        this.lbl2 = new JLabel("Introduzca el mensaje");
        
        this.btn = new JButton("Mostrar");
        
        super.add(this.lbl1);
        super.add(this.txtFld1);
        super.add(this.lbl2);
        super.add(this.txtFld2);        
        super.add(this.btn);
    }

    public JButton getBtn() {
        return btn;
    }   
    
    public JTextField getTxtFld1() {
        return txtFld1;
    }
    
    public String getTxtFld1Text() {
        return txtFld1.getText();
    }
    
    public JTextField getTxtFld2() {
        return txtFld2;
    }
    
    public String getTxtFld2Text() {
        return txtFld2.getText();
    }

    
    
    
    
}
