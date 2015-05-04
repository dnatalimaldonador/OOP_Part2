
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wenhaowu
 */
public class Participants {

    private Map<Athlete, Integer> Pmap;
    private ArrayList<Athlete> Plist;
    private Map<Athlete, ArrayList<Integer> > Lmap;
    

    public Participants() {
        this.Pmap = new HashMap<Athlete, Integer>();
        this.Plist = new ArrayList<Athlete>();
        this.Lmap = new HashMap<Athlete, ArrayList<Integer>>();
    }

    public void add(Athlete part) {

        Pmap.put(part, 0);
        this.Plist.add(part);
        
        this.Lmap.put(part, new ArrayList<Integer>());
    }

    public void setPoint(Athlete part, int points) {
        if (this.Pmap.containsKey(part)) {
            this.Pmap.put(part, points);
            part.setPoints(points);
        } else {
            System.out.println("Dont have this participant!");
        }

    }
    
    public void setLegnthArray(Athlete ath, int length){
        
        if (this.Lmap.containsKey(ath)) {
            this.Lmap.get(ath).add(length);
            
            //System.out.println(""+this.Lmap.get(ath).toString());
            //System.out.println("here");
        } else {
            System.out.println("Dont have this participant!");
        }
        
    }

    public Map<Athlete, ArrayList<Integer>> getLmap() {
        return Lmap;
    }
    
    public void getLengthArray(Athlete ath){
        ArrayList<Integer> result = this.Lmap.get(ath);
        //System.out.println(""+result.toString());
        
        if (result.size() >= 2) {

            for (int temp : result.subList(0, result.size() - 1)) {
                String temp1 = temp + " m, ";
                System.out.print(temp1);
                
            }

            String temp2 = result.get(result.size() - 1) + " m";
            System.out.print(temp2);
        }
        else{
            String temp1 = result.get(0)+" m";
            System.out.print(temp1);
        }
    }

    public void sort() {
        Collections.sort(Plist);
       
    }
    
    public void reverse(){
        Collections.reverse(Plist);
    }
    
    public ArrayList<Athlete> getPlist() {
        return Plist;
    }

}
