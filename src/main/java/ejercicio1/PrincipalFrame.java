/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author dani_
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author dani_
 */
public class PrincipalFrame extends JFrame {
    
    private BotonesPanel pnlBotones;           
    private AgregarPanel agregar;
    private TxtEdi numeros;
    private int n;
    
    

    public PrincipalFrame() throws ExcepcionNum {
        super("Suma");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 300);        
        super.setLocationRelativeTo(null);                            
        
        pnlBotones = new BotonesPanel();      
        
        this.agregar = new AgregarPanel();

                             
        
        CalcularAction e = new CalcularAction(1,2) {
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    int res = numeros.sumarLista();
                    JOptionPane.showMessageDialog(null, ("El resultado es: "+res));
                } catch (ExcepcionNum ex) {
                 
                }
            }
        };
        
        CalcularAction e1 =  new CalcularAction(1,2) {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros.limpiarLista();
            }
        };
        
        CalcularAction e2 =  new CalcularAction(1, 2) {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = JOptionPane.showConfirmDialog(null, "Quiere salir?", "Salir", 1, 1);
                if (n==0) {
                    System.exit(0);
                }
            }
        };
        
        this.n = 0;
        CalcularAction e3 =  new CalcularAction(1, 2) {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (numeros != null) {
                        remove(numeros);
                    }
                    n = agregar.getNum();                    
                    numeros = new TxtEdi(n);                    
                    add(numeros);
                    pack();                    
                } catch (ExcepcionNum ex) {
                    
                }
            }
        };
        
        
        
        
        pnlBotones.getBtnCalcular().addActionListener(e);
        pnlBotones.getBtnLimpiar().addActionListener(e1);
        pnlBotones.getBtnSalir().addActionListener(e2);
        
        agregar.getBtn1().addActionListener(e3);
        
        super.add(agregar, BorderLayout.NORTH);
        
        super.add(pnlBotones, BorderLayout.SOUTH);
        super.setVisible(true);

    }
    
    
    
    

    public static void main(String[] args) throws ExcepcionNum {
        PrincipalFrame f = new PrincipalFrame();
    }

}

