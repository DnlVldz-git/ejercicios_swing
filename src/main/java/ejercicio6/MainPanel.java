/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dani
 */
public class MainPanel extends JPanel{
    private JLabel lblArchivo;
    private JLabel lblGuardar;
    private JLabel lblColor;
    private JTextField txtFldAdjuntar;
    private JTextField txtFldGuardar;
    private JButton btnAdjuntar;
    private JButton btnGuardar;
    private JButton btnColor;
        
    public MainPanel(){
        super.setBackground(Color.PINK);
        this.lblArchivo = new JLabel("Adjuntar archivo: ");
        this.lblGuardar = new JLabel("         Guardar: ");
        this.lblColor = new JLabel("             Color: ");
        this.txtFldAdjuntar = new JTextField(20);
        this.txtFldGuardar = new JTextField(20);
        this.btnAdjuntar = new JButton("...");
        this.btnGuardar = new JButton("...");
        this.btnColor = new JButton("...");
        
        super.add(this.lblArchivo);
        super.add(this.txtFldAdjuntar);
        super.add(this.btnAdjuntar);
        super.add(this.lblGuardar);
        super.add(this.txtFldGuardar);
        super.add(this.btnGuardar);
        super.add(this.lblColor);        
        super.add(this.btnColor);
        
    }

    public JLabel getLblArchivo() {
        return lblArchivo;
    }

    public void setLblArchivoTxt(String txt) {
        this.lblArchivo = lblArchivo;
    }

    public JLabel getLblGuardar() {
        return lblGuardar;
    }

    public void setLblGuardar(JLabel lblGuardar) {
        this.lblGuardar = lblGuardar;
    }

    public JLabel getLblColor() {
        return lblColor;
    }

    public void setLblColor(JLabel lblColor) {
        this.lblColor = lblColor;
    }

    public JTextField getTxtFldAdjuntar() {
        return txtFldAdjuntar;
    }

    public void setTxtFldAdjuntarTxt(String txt) {
        this.txtFldAdjuntar.setText(txt);
    }

    public JTextField getTxtFldGuardar() {
        return txtFldGuardar;
    }

    public void setTxtFldGuardarTxt(String txt) {
        this.txtFldGuardar.setText(txt);
    }

    public JButton getBtnAdjuntar() {
        return btnAdjuntar;
    }

    public void setBtnAdjuntar(JButton btnAdjuntar) {
        this.btnAdjuntar = btnAdjuntar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JButton getBtnColor() {
        return btnColor;
    }

    public void setBtnColor(JButton btnColor) {
        this.btnColor = btnColor;
    }
    
    public void setColor(Color color){
        super.setBackground(color);
    }
    
}
