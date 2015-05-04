
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wenhaowu
 */
public class Planes {
    private ArrayList<Plane> list;
    private HashMap<String, Plane> map;
    
    public Planes(){
        this.list = new ArrayList<Plane>();
        this.map = new HashMap<String, Plane>();
    }
    
    public void add(Plane pl){
        this.list.add(pl);
        this.map.put(pl.getID(), pl);
    }
    
    public void printPlns(){
        for(Plane temp: this.list){
            System.out.println(temp);
        }
    }
    
    public String printSinglePln(String ID){
        Plane result= null;
        
        if(this.map.containsKey(ID)){
           result = this.map.get(ID);
        }
        
        return result.getID() + " (" + result.getCapacity()+ " ppl)";
    }
}
