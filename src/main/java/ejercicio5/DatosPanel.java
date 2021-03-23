/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author dani
 */
public class DatosPanel extends JPanel{
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lblHide;
    private JTextField txtFld;
    private JPasswordField pswFld;
    private JToggleButton tgl;
    private JButton btn;
    
    public DatosPanel(){
        super.setBackground(Color.PINK);
        
        this.lbl1 = new JLabel("Ingrese su usuario");
        this.lbl2 = new JLabel("Ingrese su contraseña");
        this.lblHide = new JLabel("sdas");
        this.txtFld = new JTextField(15);
        this.pswFld = new JPasswordField(15);
        this.tgl = new JToggleButton("Mostrar");
        this.btn = new JButton("Ingresar");
        this.lblHide.setVisible(false);
        
        
        super.add(this.lbl1);
        super.add(this.txtFld);
        super.add(this.lbl2);
        super.add(this.pswFld);
        super.add(this.tgl);
        super.add(this.lblHide);
        super.add(this.btn);
        
    }

    public JLabel getLblHide() {
        return lblHide;
    }

    public void setLblhide(String psw) {
        this.lblHide.setText(psw); 
    }

    public JPasswordField getPswFld() {
        return pswFld;
    }

    public String getTxtFldText() {
        return txtFld.getText();
    }    

    public void clearPswFld() {
        this.pswFld.setText("");
    }

    public JToggleButton getTgl() {
        return tgl;
    }

    public JButton getBtn() {
        return btn;
    }

    public JTextField getTxtFld() {
        return txtFld;
    }

    
    
    
    
}
