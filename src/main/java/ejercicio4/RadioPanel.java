/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author dani
 */
public class RadioPanel extends JPanel{
    private ButtonGroup r;
    private JRadioButton btn1;
    private JRadioButton btn2;
    private JRadioButton btn3;
    private JRadioButton btn4;
    
    public RadioPanel(){
        super.setBackground(Color.CYAN);
        
        this.r = new ButtonGroup();
        
        this.btn1 = new JRadioButton("Información");
        this.btn2 = new JRadioButton("Pregunta");
        this.btn3 = new JRadioButton("Precaución");
        this.btn4 = new JRadioButton("Error");
        
        this.r.add(btn1);
        this.r.add(btn2);
        this.r.add(btn3);
        this.r.add(btn4);
        
        super.add(this.btn1);
        super.add(this.btn2);
        super.add(this.btn3);
        super.add(this.btn4);
    }

    public JRadioButton getBtn1() {
        return btn1;
    }

    public JRadioButton getBtn2() {
        return btn2;
    }

    public JRadioButton getBtn3() {
        return btn3;
    }

    public JRadioButton getBtn4() {
        return btn4;
    }
    
    
    
}
