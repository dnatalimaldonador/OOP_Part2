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
public class Square extends Figure {

    private int slideLength;

    public Square(int x, int y, int slideLength) {
        super(x, y);
        this.slideLength = slideLength;
    }

    @Override
    public void draw(Graphics graphics) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        graphics.fillRect(super.getX(), super.getY(), slideLength, slideLength);
    }

}
