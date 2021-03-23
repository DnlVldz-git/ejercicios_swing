/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dani_
 */
public class NumerosPanel extends JPanel {

    private JTextField txt1;
    private JLabel lbl1;

    BorderLayout bd = new BorderLayout();

    public NumerosPanel(String text) {
        super.setBackground(Color.PINK);

        this.lbl1 = new JLabel(text);
        this.txt1 = new JTextField(15);

        super.add(this.lbl1);
        super.add(this.txt1);

    }
    
    public void setTxt(String s) {
        this.txt1.setText(s);
    }

    public Integer getNum() throws ExcepcionNum {
        try {
            Integer res = Integer.parseInt(this.txt1.getText());
            return res;
        } catch (Exception e) {
            this.txt1.requestFocus();
            throw new ExcepcionNum("Hola");
        }
    }
    
    public JTextField getTxtF() {
        return this.txt1;
    }

}
