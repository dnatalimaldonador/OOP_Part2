
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
public class CalculatorLogic {
    //private ArrayList<Integer> resultList;
    int sum;

    public CalculatorLogic() {
        //this.resultList = new ArrayList<Integer>();
        this.sum = 0;
    }
    
    public void add(int a){
        //this.resultList.add(a);
        sum += a;
    }
    
    public void remove(int a){
        
        this.sum -= a;
    }
    
    public void removeAll(){
        //this.resultList.removeAll(resultList);
        this.sum = 0;
    }

    @Override
    public String toString() {
        /*
        String result="";
        
        for(int temp : this.resultList){
            result += temp+"";
        }
        return result;
        */
        return ""+this.sum;
    }
    
    
}
