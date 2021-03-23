/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dani
 */
public class ModuloPnl extends JPanel{
    private JTextField txtFld;
    private JComboBox cmbBox;
    private JLabel lbl;    
    
    public ModuloPnl(){
        super.setBackground(Color.PINK);
        
        this.txtFld = new JTextField(15);
        this.cmbBox = new JComboBox();
        this.lbl = new JLabel("Ingrese la cantidad");
        
        this.cmbBox.addItem("Dolar a Peso");
        this.cmbBox.addItem("Peso a Dolar");                
        
        super.add(this.lbl);
        super.add(this.txtFld);
        super.add(this.cmbBox);
    }

    public float getNum() throws ExcepcionNum {
        try {
            float num = Float.parseFloat(this.txtFld.getText());
            return num;
        } catch (Exception e) {
            throw new ExcepcionNum("hola");
        }
    }        
    
    public int getIndex(){
         if (this.cmbBox.getSelectedItem().equals("Dolar a Peso")) {
            return 0;
        }else{
             return 1;
         }

    }
    
}
