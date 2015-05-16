/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author wenhaowu
 */
public class CompoundFigure extends Figure {

    private ArrayList<Figure> list;
    
    
    public CompoundFigure(int x, int y) {
        super(x, y);
        this.list = new ArrayList<Figure>();
    }

    public CompoundFigure() {
        super(1, 2);
        this.list = new ArrayList<Figure>();
    }
    
    
   
    public void add(Figure figure) {
        this.list.add(figure);
    }

    @Override
    public void draw(Graphics graphics) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        for (Figure temp : this.list) {
            temp.draw(graphics);
        }
    }

    @Override
    public void move(int dx, int dy) {
        //super.move(dx, dy); //To change body of generated methods, choose Tools | Templates.
        for(Figure temp:this.list){
            temp.move(dx, dy);
        }
    }

}
