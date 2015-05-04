
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
public class Dictionary {

    private HashMap<String, String> map;

    public Dictionary() {
        this.map = new HashMap<String, String>();

    }
    
    public void add(String word, String translation){
        map.put(word, translation);
    }
    
    public String translate(String word){
        if(this.map.containsKey(word)){
            return this.map.get(word);
        }
        else{
            return null;
        }
    }
    
    public int amountOfWords(){
        return this.map.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> result = new ArrayList<String>();
        
        for(String trans : this.map.keySet()){
            result.add(trans+" = "+map.get(trans));
        }
        
        return result;
    }
}
