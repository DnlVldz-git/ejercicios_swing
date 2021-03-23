/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dani
 */
public class TxtEdi extends JPanel {
        
    private NumerosPanel num1;
    private ArrayList<NumerosPanel> edis; 
    private Integer n;
        
    
    public TxtEdi(Integer n){
        this.n = n;
        this.resetLista();
        this.crearLista();
        this.agregarLista();
        
    }                   
        
    public void crearLista(){
        this.edis = new ArrayList();
        for (int i = 0; i < this.n; i++) {
            NumerosPanel e = new NumerosPanel(("Numero "+i));
            edis.add(e);
        }
    }
    
    public void agregarLista(){
        for (NumerosPanel edi : edis) {
            super.add(edi);
        }     
        
    }
    
    public Integer sumarLista() throws ExcepcionNum{
        Integer res= 0;
        for (NumerosPanel edi : edis) {
            res += edi.getNum();
        }
        return res;
    }
    
    public void limpiarLista(){
        for (NumerosPanel edi : edis) {
            edi.setTxt("");
        }
    }
    
    public void resetLista(){
        if (edis!=null) {
            edis.clear();
        }        
    }
   
    
}
