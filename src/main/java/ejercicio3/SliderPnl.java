/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author dani
 */
public class SliderPnl extends JPanel{
    private JSlider sldR;
    private JSlider sldA;
    private JSlider sldV;
    private JSpinner spnR;
    private JSpinner spnA;
    private JSpinner spnV;
    private JLabel lblR;
    private JLabel lblA;
    private JLabel lblV;
    
    public SliderPnl(){
        super.setBackground(Color.PINK);        
        
        this.sldR = new JSlider(0,255);
        this.sldA = new JSlider(0,255);
        this.sldV = new JSlider(0,255);
        
        this.spnR = new JSpinner(new SpinnerNumberModel(0,0,255,1));
        this.spnA = new JSpinner(new SpinnerNumberModel(0,0,255,1));
        this.spnV = new JSpinner(new SpinnerNumberModel(0,0,255,1)); 
        
        this.lblR = new JLabel("Rojo");
        this.lblA = new JLabel("Azul");
        this.lblV = new JLabel("Verde");
        
        super.add(this.lblR);
        super.add(this.sldR);
        super.add(this.spnR);
        super.add(this.lblA);
        super.add(this.sldA);
        super.add(this.spnA);
        super.add(this.lblV);
        super.add(this.sldV);
        super.add(this.spnV);                
    }        

    public Integer getSldRN() {
        return sldR.getValue();
    }

    public void setSldRN(Integer n) {
        this.sldR.setValue(n);
    }

    public Integer getSldAN() {
        return sldA.getValue();
    }

    public void setSldAN(Integer n) {
        this.sldA.setValue(n);
    }

    public Integer getSldVN() {
        return sldV.getValue();
    }

    public void setSldVN(Integer n) {
        this.sldV.setValue(n);
    }

    public Integer getSpnRN() {
        return (Integer)spnR.getValue();
    }

    public void setSpnRN(Integer n ) {
        this.spnR.setValue(n);
    }

    public Integer getSpnAN() {
        return (Integer)spnA.getValue();
    }

    public void setSpnAN(Integer n) {
        this.spnA.setValue(n);
    }

    public Integer getSpnVN() {
        return (Integer)spnV.getValue();
    }

    public void setSpnVN(Integer n) {
        this.spnV.setValue(n);
    }

    public JSlider getSldR() {
        return sldR;
    }

    public JSlider getSldA() {
        return sldA;
    }

    public JSlider getSldV() {
        return sldV;
    }

    public JSpinner getSpnR() {
        return spnR;
    }

    public JSpinner getSpnA() {
        return spnA;
    }

    public JSpinner getSpnV() {
        return spnV;
    }
    
    
    
    
}
