
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
public class Suitcase {

    private ArrayList<Thing> list;
    private int maxWeight;
    private int counter;

    public Suitcase(int maxWeighte) {
        this.maxWeight = maxWeighte;
        this.list = new ArrayList<Thing>();
        this.counter = 0;
    }

    public void addThing(Thing thing) {

        if ((this.getCurWeight() + thing.getWeight()) <= this.maxWeight) {

            this.list.add(thing);

            this.counter++;
        }
    }

    @Override
    public String toString() {

        if (this.counter == 1) {
            return "1 thing (" + this.getCurWeight() + " kg)";
        } else if (this.counter == 0) {
            return "empty (0 kg)";
        } else {
            return this.counter + " things (" + this.getCurWeight() + " kg)";
        }

    }

    public int getCurWeight() {
        int sum = 0;

        for (Thing temp : list) {
            sum += temp.getWeight();
        }

        return sum;
    }

    public void printThings() {

        for (Thing temp : list) {
            System.out.println(temp);
        }

    }

    public int totalWeight() {

        return this.getCurWeight();
    }

    public Thing heaviestThing() {
        
        if (list.isEmpty()) {
            return null;
        }
        else{
            Thing result = list.get(0);

            for (Thing temp : list) {
                if (temp.getWeight() > result.getWeight()) {
                    result = temp;
                }
            }

            return result;
        }
    }
}
