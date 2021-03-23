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
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class BotonesPanel extends JPanel{
    
    private JButton btnCalcular;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private JPanel pnl1;
    private JPanel pnl2;    
    BorderLayout bd = new BorderLayout();
    
    public BotonesPanel(){
        super.setBackground(Color.GREEN);   
        this.setLayout(bd);
        
        this.btnCalcular = new JButton("Calcular");
        this.btnLimpiar = new JButton("Limpiar");
        this.btnSalir = new JButton("Salir");                
        
        this.pnl1 = new JPanel();
        this.pnl1.setBackground(Color.GREEN);
        
        this.pnl2 = new JPanel();
        this.pnl2.setBackground(Color.GREEN);
        
        this.pnl2.add(this.btnCalcular);
        this.pnl2.add(this.btnLimpiar);
        
        this.pnl1.add(this.btnSalir);
                
        super.add(this.pnl1, BorderLayout.WEST);
        super.add(this.pnl2, BorderLayout.EAST);
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    
    
    
    
}
