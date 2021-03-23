/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class PrincipalFrame extends JFrame{
    
    private ModuloPnl modulo;
    private BotonPanel btn;
    
    public PrincipalFrame(){
        super("Conversión");
        super.setBackground(Color.BLACK);        
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 100);        
        super.setLocationRelativeTo(null);   
        
        this.modulo = new ModuloPnl();
        
        this.btn = new BotonPanel();
        
        BtnActionListener e = new BtnActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                float res=0;
                if (modulo.getIndex()==0) {
                    try {
                        res = (float) (modulo.getNum()*20.72);
                        JOptionPane.showMessageDialog(null, "Son "+res+" pesos.");
                    } catch (ExcepcionNum ex) {
                        
                    }
                    
                }else{
                    try {
                        res = (float) (modulo.getNum()*0.048);
                        JOptionPane.showMessageDialog(null, "Son "+res+" dólares.");
                    } catch (ExcepcionNum ex) {
                        
                    }
                }
                
            }
        };        
        
        this.btn.getBtn().addActionListener(e);
        
        
        super.add(this.btn, BorderLayout.SOUTH);
        super.add(this.modulo, BorderLayout.NORTH);
        super.setVisible(true);
        
    }
    public static void main(String[] args) {
        PrincipalFrame f = new PrincipalFrame();
    }
    
}
