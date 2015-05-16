/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author wenhaowu
 */
public class CopyListener implements ActionListener{
    private JTextField JT;
    private JLabel JB;

    public CopyListener(JTextField JT, JLabel JB) {
        this.JT = JT;
        this.JB = JB;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.JB.setText(this.JT.getText());
        this.JT.setText("");
    }
    
}
