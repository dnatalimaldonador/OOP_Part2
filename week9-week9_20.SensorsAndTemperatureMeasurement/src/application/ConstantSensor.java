/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author wenhaowu
 */
public class ConstantSensor implements Sensor{
    private int value;
    //private boolean state;
    
    public ConstantSensor(int value){
        this.value = value;
        //this.state = false;
    }
    
  
    
    @Override
    public boolean isOn() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return true;
    }

    @Override
    public void on() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //this.state = true;
    }

    @Override
    public void off() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int measure() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.value;
    }
    
}
