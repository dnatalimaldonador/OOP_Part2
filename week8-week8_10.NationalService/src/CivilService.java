/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wenhaowu
 */
public class CivilService implements NationalService{
    private int daysleft;
    
    public CivilService(){
        this.daysleft = 362;
    }
    
    public int getDaysLeft(){
        return this.daysleft;
    }
    
    public void work(){
        if(this.daysleft>0){
            this.daysleft --;
        }
    }
}
