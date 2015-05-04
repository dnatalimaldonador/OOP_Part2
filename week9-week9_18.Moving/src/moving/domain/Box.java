/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;

/**
 *
 * @author wenhaowu
 */
public class Box implements Thing{
    private int maximumCapacity;
    //private int currentCapacity;
    private ArrayList<Thing> things;
       
    public Box(int max){
        this.maximumCapacity = max;
        //this.currentCapacity = 0;
        this.things = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        if(this.getVolume() + thing.getVolume() <= this.maximumCapacity){
            this.things.add(thing);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int getVolume() {
        int result=0;
        
        for(Thing temp : this.things){
            result += temp.getVolume();
        }
        return result;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
