/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author wenhaowu
 */
public class ClickListener implements ActionListener{
    private Calculator cal;
    private JLabel JL;

    public ClickListener(Calculator cal, JLabel JL) {
        this.cal = cal;
        this.JL = JL;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.cal.increase();
        this.JL.setText(""+this.cal.giveValue());
    }
    
}
