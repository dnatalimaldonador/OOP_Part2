
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wenhaowu
 */
public class Box implements ToBeStored{
    private double maxWeight;
    private double curWeight;
    private ArrayList<ToBeStored> list;
    
    public Box(double max){
        this.maxWeight = max;
        this.curWeight =0;
        this.list = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored thing){
        if((this.curWeight + thing.weight())<=this.maxWeight){
            this.list.add(thing);
            this.curWeight += thing.weight();
        }
    }

    @Override
    public String toString() {
            return "Box: " + this.list.size()+" things, " + "total weight " + curWeight + " kg";
    }
    
    
    
    @Override
    public double weight() {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double weight = 0;
        
        for(ToBeStored temp: this.list){
            weight += temp.weight();
        }
        
        return weight;
    }
    
}
