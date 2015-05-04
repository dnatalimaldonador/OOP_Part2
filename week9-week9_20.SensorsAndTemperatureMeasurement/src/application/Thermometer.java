/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author wenhaowu
 */
public class Thermometer implements Sensor{
    
    private boolean state;

    public Thermometer() {
        this.state = false;
    }
    
    
    
    @Override
    public boolean isOn() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.state;
    }

    @Override
    public void on() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.state = true;
    }

    @Override
    public void off() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.state = false;
    }

    @Override
    public int measure() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(this.state){
            Random rd = new Random();
            return rd.nextInt(61) -30;
        }
        else{
            throw new  IllegalStateException("Wrong");
        }
    }
    
}
