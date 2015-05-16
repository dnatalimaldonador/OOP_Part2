/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author wenhaowu
 */
public class Box extends Figure{
    private int width;
    private int heigth;

    public Box(int x, int y, int width, int heigth) {
        super(x, y);
        this.width = width;
        this.heigth = heigth;
    }
    
    
    @Override
    public void draw(Graphics graphics) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        graphics.fillRect(super.getX(), super.getY(), width, heigth);
    }
    
}
