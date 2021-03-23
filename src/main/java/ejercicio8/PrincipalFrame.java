/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author dani
 */
public class PrincipalFrame extends JFrame{
    private Menu mn;
    
    public PrincipalFrame(){
        super("Check Boxes");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 200);
        super.setLocationRelativeTo(null);
        
        this.mn = new Menu();
        
        super.add(this.mn, BorderLayout.NORTH);
        super.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        PrincipalFrame f = new PrincipalFrame();
    }
    
}
