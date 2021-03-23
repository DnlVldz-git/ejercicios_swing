/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author dani
 */
public class PrincipalFrame extends JFrame {

    private MainPanl pnl;

    public PrincipalFrame() {
        super("Check Boxes");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 200);
        super.setLocationRelativeTo(null);

        this.pnl = new MainPanl();

        CheckBoxActionListener e = new CheckBoxActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultado = "geek-";
                resultado = resultado + (pnl.getChkBxBarbilla().isSelected()?"c":"-");
                resultado = resultado + (pnl.getChkBxLentes().isSelected()?"g":"-");
                resultado = resultado + (pnl.getChkBxCabello().isSelected()?"h":"-");
                resultado = resultado + (pnl.getChkBxDientes().isSelected()?"t":"-");
                resultado = resultado + ".gif";
                
                ImageIcon icon = new ImageIcon(resultado);
                pnl.getLbl().setIcon(icon);
                
            }
        };

        this.pnl.getChkBxBarbilla().addActionListener(e);
        this.pnl.getChkBxCabello().addActionListener(e);
        this.pnl.getChkBxLentes().addActionListener(e);
        this.pnl.getChkBxDientes().addActionListener(e);

        super.add(this.pnl);
        super.setVisible(true);
    }

    public static void main(String[] args) {
        PrincipalFrame f = new PrincipalFrame();
    }

}
