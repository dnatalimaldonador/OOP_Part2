
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
public class Container {

    private int maxWeight;
    private ArrayList<Suitcase> list;
    private int counter;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<Suitcase>();
        this.counter = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((this.totalWeight() + suitcase.totalWeight()) <= this.maxWeight) {
            list.add(suitcase);
            counter++;
        }
       
    }

    public int totalWeight() {
        int sum = 0;
        for (Suitcase temp : list) {
            sum += temp.totalWeight();
        }
        return sum;
    }

    @Override
    public String toString() {
        return counter+" suitcases ("+this.totalWeight()+" kg)";
    }
    
    public void printThings(){
        for(Suitcase temp: list){
            temp.printThings();
        }
    }
    
    

}
