/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author wenhaowu
 */
public class KeyboardListener implements KeyListener{
    
    private Component component;
    private Figure figure;

    public KeyboardListener(Component component, Figure figure) {
        this.component = component;
        this.figure = figure;
    }
    
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //this.component.repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int orginX = this.figure.getX();
        int orginY = this.figure.getY();
        
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            this.figure.move(-1, 0);
        }
        else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            figure.move(1,0);
        }
        else if(e.getKeyCode()==KeyEvent.VK_UP){
            figure.move(0,-1);
        }
        else if(e.getKeyCode()==KeyEvent.VK_DOWN){
            figure.move(0,1);
        }
        
        this.component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
