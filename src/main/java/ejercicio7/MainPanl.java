/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import ejercicio6.MainPanel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author dani
 */
public class MainPanl extends JPanel{
    private JLabel lbl;
    private JCheckBox chkBxDientes;
    private JCheckBox chkBxCabello;
    private JCheckBox chkBxLentes;
    private JCheckBox chkBxBarbilla;    
    
    public MainPanl(){
        super.setBackground(Color.pink);
                        
        ImageIcon icon = new ImageIcon("geek-----.gif");
        this.lbl = new JLabel();
        this.lbl.setIcon(icon);
        
        this.chkBxDientes = new JCheckBox("Dientes");
        this.chkBxCabello = new JCheckBox("Cabello");
        this.chkBxLentes = new JCheckBox("Lentes");
        this.chkBxBarbilla = new JCheckBox("Barbilla");
        
        
        super.add(this.chkBxDientes);
        super.add(this.chkBxCabello);
        super.add(this.chkBxLentes);
        super.add(this.chkBxBarbilla);
        super.add(this.lbl);
    }

    public JLabel getLbl() {
        return lbl;
    }

    public void setLbl(JLabel lbl) {
        this.lbl = lbl;
    }

    public JCheckBox getChkBxDientes() {
        return chkBxDientes;
    }

    public void setChkBxDientes(JCheckBox chkBxDientes) {
        this.chkBxDientes = chkBxDientes;
    }

    public JCheckBox getChkBxCabello() {
        return chkBxCabello;
    }

    public void setChkBxCabello(JCheckBox chkBxCabello) {
        this.chkBxCabello = chkBxCabello;
    }

    public JCheckBox getChkBxLentes() {
        return chkBxLentes;
    }

    public void setChkBxLentes(JCheckBox chkBxLentes) {
        this.chkBxLentes = chkBxLentes;
    }

    public JCheckBox getChkBxBarbilla() {
        return chkBxBarbilla;
    }

    public void setChkBxBarbilla(JCheckBox chkBxBarbilla) {
        this.chkBxBarbilla = chkBxBarbilla;
    }
    
    
}
