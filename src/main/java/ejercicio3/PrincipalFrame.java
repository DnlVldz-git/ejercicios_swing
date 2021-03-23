/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio2.BtnActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author dani
 */
public class PrincipalFrame extends JFrame{
    private SliderPnl sli;
    private JPanel pnl;
    
    public PrincipalFrame(){
        super("Color");
        super.setBackground(Color.BLACK);        
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(900, 200);        
        super.setLocationRelativeTo(null);  
        
        this.pnl = new JPanel();        
        
        this.sli = new SliderPnl();
        
        ColorActionListener eSlR = new ColorActionListener(){
            @Override
            public void stateChanged(ChangeEvent e) {                
                sli.setSpnRN(sli.getSldRN()); 
                 
                Color color = new Color(sli.getSldRN(),sli.getSldVN(),sli.getSldAN());
                pnl.setBackground(color);
            }
        };
        
        ColorActionListener eSpR = new ColorActionListener(){
            @Override
            public void stateChanged(ChangeEvent e) {                
                sli.setSldRN(sli.getSpnRN());  
                Color color = new Color(sli.getSldRN(),sli.getSldVN(),sli.getSldAN());
                pnl.setBackground(color);
            }
        };
        
        ColorActionListener eSlA = new ColorActionListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                sli.setSpnAN(sli.getSldAN());
                Color color = new Color(sli.getSldRN(),sli.getSldVN(),sli.getSldAN());
                pnl.setBackground(color);
            }
        };
        
        ColorActionListener eSpA = new ColorActionListener(){
            @Override
            public void stateChanged(ChangeEvent e) {                
                sli.setSldAN(sli.getSpnAN());  
                Color color = new Color(sli.getSldRN(),sli.getSldVN(),sli.getSldAN());
                pnl.setBackground(color);
            }
        };
        
        ColorActionListener eSlV = new ColorActionListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                sli.setSpnVN(sli.getSldVN());
                Color color = new Color(sli.getSldRN(),sli.getSldVN(),sli.getSldAN());
                pnl.setBackground(color);
            }
        };
        
        ColorActionListener eSpV = new ColorActionListener(){
            @Override
            public void stateChanged(ChangeEvent e) {                
                sli.setSldVN(sli.getSpnVN());  
                Color color = new Color(sli.getSldRN(),sli.getSldVN(),sli.getSldAN());
                pnl.setBackground(color);
            }
        };
        
        this.sli.getSldR().addChangeListener(eSlR);
        this.sli.getSldA().addChangeListener(eSlA);
        this.sli.getSldV().addChangeListener(eSlV);
        
        this.sli.getSpnR().addChangeListener(eSpR);
        this.sli.getSpnA().addChangeListener(eSpA);
        this.sli.getSpnV().addChangeListener(eSpV);
                
        super.add(this.pnl, BorderLayout.CENTER);
        super.add(this.sli, BorderLayout.NORTH);
        super.setVisible(true);
        
    }
    public static void main(String[] args) {
        PrincipalFrame f = new PrincipalFrame();
    }
    
}
