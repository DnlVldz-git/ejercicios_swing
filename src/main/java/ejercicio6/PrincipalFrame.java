/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author dani
 */
public class PrincipalFrame extends JFrame {

    private MainPanel pnl1;
    private JFileChooser fle;
    private JColorChooser clr;

    public PrincipalFrame() {
        super("Diálogos de selección");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 200);
        super.setLocationRelativeTo(null);

        this.pnl1 = new MainPanel();
        this.fle = new JFileChooser();
        this.clr = new JColorChooser();

        BtnActionListener e = new BtnActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resultado = fle.showOpenDialog(pnl1);
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    pnl1.getTxtFldAdjuntar().setText(fle.getSelectedFile().toString());
                }
            }
        };
        
        BtnActionListener e1 = new BtnActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resultado = fle.showSaveDialog(pnl1);
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    pnl1.getTxtFldGuardar().setText(fle.getSelectedFile().toString());
                }
            }
        };
        
        BtnActionListener e2 = new BtnActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = clr.showDialog(pnl1, "Selecciona un color", Color.BLUE);
                pnl1.setColor(color);
                pack();
                setSize(500, 200);
            }
        };
        
        this.pnl1.getBtnAdjuntar().addActionListener(e);
        this.pnl1.getBtnGuardar().addActionListener(e1);
        this.pnl1.getBtnColor().addActionListener(e2);

        super.add(this.pnl1);

        super.setVisible(true);
    }

    public static void main(String[] args) {
        PrincipalFrame f = new PrincipalFrame();
    }

}
