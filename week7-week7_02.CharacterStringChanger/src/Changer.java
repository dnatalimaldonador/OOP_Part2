
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
public class Changer {
    ArrayList<Change> list;
    
    public Changer(){
        list = new ArrayList<Change>();
    }
    
    public void addChange(Change change) {
        list.add(change);
    }
    
    public String change(String characterString){
        String result="";
        String parm = characterString;
        
        for(Change temp: this.list){
            result = temp.change(parm);
            parm = result;
        }
        
        
        
        return result;
    }
}
