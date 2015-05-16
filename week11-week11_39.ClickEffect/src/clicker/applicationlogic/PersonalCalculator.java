/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.applicationlogic;

/**
 *
 * @author wenhaowu
 */
public class PersonalCalculator implements Calculator{
    
    private int clickCount;
    
    public PersonalCalculator() {
        this.clickCount = 0;
    }
    
    
    
    @Override
    public int giveValue() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.clickCount;
    }

    @Override
    public void increase() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.clickCount ++;
    }
    
}
