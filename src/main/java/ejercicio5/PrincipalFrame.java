/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.awt.event.ActionEvent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class PrincipalFrame extends JFrame{
    private DatosPanel pnl1;
    
    
    public PrincipalFrame(){
        super("Login");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(450, 200);
        super.setLocationRelativeTo(null);
        
        this.pnl1 = new DatosPanel();
        
        BtnActionListener e = new BtnActionListener(){          
            @Override
            public void actionPerformed(ActionEvent e) {                
                pnl1.getLblHide().setVisible(pnl1.getTgl().isSelected());                
                pnl1.setLblhide(String.copyValueOf(pnl1.getPswFld().getPassword()));                               
            }
        };
        
        BtnActionListener e1 = new BtnActionListener(){          
            @Override
            public void actionPerformed(ActionEvent e) {                
                if (pnl1.getTxtFldText().equals("")) {
                    pnl1.getTxtFld().requestFocus();
                    JOptionPane.showMessageDialog(null, "Introduzca un user adecuado");
                }else if (String.copyValueOf(pnl1.getPswFld().getPassword()).equals("")) {
                    pnl1.getPswFld().requestFocus();
                    JOptionPane.showMessageDialog(null, "Introduzca una contraseña");
                }else{
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                }
            }
        };
        
        this.pnl1.getTgl().addActionListener(e);
        this.pnl1.getBtn().addActionListener(e1);
        
        
        super.add(this.pnl1);
        super.setVisible(true);
    }
    
    public static void main(String[] args) {
        PrincipalFrame f = new PrincipalFrame();
    }
    
}

