/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dani
 */
public class AgregarPanel extends JPanel{
    
    private JTextField txt1;
    private JComboBox box1;
    private JLabel lbl1;
    private JButton btn1;
    private Integer[] n;
    
    public AgregarPanel(){
        super.setBackground(Color.LIGHT_GRAY);
        
        this.n = new Integer[20];
        this.addItemInt();
        this.box1 = new JComboBox(n);
        this.addItemBox();
        this.lbl1 = new JLabel("Cuántos números serán?");
        this.btn1 = new JButton("Agregar");                
        
        super.add(this.lbl1);
        super.add(this.box1);
        super.add(this.btn1);
        
    }

    public Integer getNum() throws ExcepcionNum {
        try {
            Integer res = this.n[this.box1.getSelectedIndex()];
            return res;
        } catch (Exception e) {            
            throw new ExcepcionNum("Hola");
        }
        
    }

    public JButton getBtn1() {
        return btn1;
    }
    
    public void addItemInt(){
        for (int i = 0; i < 20; i++) {
            this.n[i]=i+1;            
        }
    }
    
    public void addItemBox(){
        for (int i = 0; i < 20; i++) {
            this.box1.addItem(1);
        }
    }
    
}
