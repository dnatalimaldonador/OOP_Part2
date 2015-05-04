
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wenhaowu
 */
public class Hand implements Comparable<Hand>{
    private ArrayList <Card> list;
    
    public Hand(){
        this.list = new ArrayList<Card>();
    }
    
    public void add(Card c){
        this.list.add(c);
    }
    
    public void print(){
        //this.sort();
        
        for(Card temp : list){
            System.out.println(temp);
        }
    }
    
    public void sort (){
        Collections.sort(list);
    }
    
    public void sortAgainstSuit(){
        Collections.sort(list, new SortAgainstSuitAndValue());
        
    }
    
    @Override
    public int compareTo(Hand o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int v1 = 0, v2=0;
        for(Card temp : this.list){
            v1 += temp.getValue();
        }
        for (Card temp: o.list){
            v2 += temp.getValue();
        }
        
        return v1 - v2;
    }
}
