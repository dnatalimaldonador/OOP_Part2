
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
public class Flights {
    private ArrayList<Flight> list;
    private HashMap<String, Flight> map;
    
    public Flights(){
        this.list = new ArrayList<Flight>();
        this.map = new HashMap<String, Flight>();
    }
    
    public void add(Flight fl){
        this.list.add(fl);
    }
    
    public void printFlgs(Planes pln){
        for(Flight temp: this.list){
            System.out.println(temp.toString(pln));
        }
    }
}
