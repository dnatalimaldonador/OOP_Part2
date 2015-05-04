/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wenhaowu
 */
public class Flight {
    private String ID;
    private String dep;
    private String des;
    
    public Flight(String id, String dep, String des){
        this.ID = id;
        this.dep = dep;
        this.des = des;
    }

    
    public String toString(Planes pln) {
        return pln.printSinglePln(ID) + " ("+this.dep+"-"+this.des+")";
    }
    
    
    
}
