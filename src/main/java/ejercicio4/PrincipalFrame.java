/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class PrincipalFrame extends JFrame {

    private TextPnl txt;
    private RadioPanel btn;

    public PrincipalFrame() {
        super("Diálogos");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(900, 200);
        super.setLocationRelativeTo(null);

        this.txt = new TextPnl();
        this.btn = new RadioPanel();

        BtnActionListener e = new BtnActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btn.getBtn1().isSelected()) {                    
                    JOptionPane.showMessageDialog(null, txt.getTxtFld1Text(), txt.getTxtFld2Text(), JOptionPane.INFORMATION_MESSAGE);                    
                }else if (btn.getBtn2().isSelected()) {
                    JOptionPane.showMessageDialog(null, txt.getTxtFld1Text(), txt.getTxtFld2Text(), JOptionPane.QUESTION_MESSAGE);                    
                }else if (btn.getBtn3().isSelected()) {
                    JOptionPane.showMessageDialog(null, txt.getTxtFld1Text(), txt.getTxtFld2Text(), JOptionPane.WARNING_MESSAGE);                    
                }else if (btn.getBtn4().isSelected()) {
                    JOptionPane.showMessageDialog(null, txt.getTxtFld1Text(), txt.getTxtFld2Text(), JOptionPane.ERROR_MESSAGE);                    
                }
            }
        };
        
        this.txt.getBtn().addActionListener(e);

        super.add(this.txt, BorderLayout.NORTH);
        super.add(this.btn);
        super.setVisible(true);

    }

    public static void main(String[] args) {
        PrincipalFrame f = new PrincipalFrame();
    }

}
