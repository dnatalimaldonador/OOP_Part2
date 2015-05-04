
import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wenhaowu
 */
public class Storehouse {
    private Map<String, Integer> mPrice;
    private Map<String, Integer> mStock;
    
    public Storehouse(){
        this.mPrice = new HashMap<String, Integer>();
        this.mStock = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
         this.mPrice.put(product, price);
         this.mStock.put(product, stock);
    }
    
    public int price(String product){
        if(this.mPrice.containsKey(product)){
            return this.mPrice.get(product);
        }
        return -99;
    }
    
    public int stock(String product){
        if(this.mStock.containsKey(product)){
            return this.mStock.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
        if(this.mStock.containsKey(product)){
            int Value = this.mStock.get(product);
            if(Value >= 1){
                this.mStock.put(product, Value-1);
                return true;
            }
            else{
                return false;
            }
            
        }
        return false;
    }
    
    public Set<String> products(){
        return this.mPrice.keySet();
    }
    
}
