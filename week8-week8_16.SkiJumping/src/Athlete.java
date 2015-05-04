
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
public class Athlete implements Comparable<Athlete> {

    private String name;
    private int points;
    private ArrayList<Integer> JumpLength;

    public void getJumpLength() {
        //return JumpLength;
        //ArrayList<String> result = new ArrayList<String>();
        if (this.JumpLength.size() >= 2) {

            for (int temp : this.JumpLength.subList(0, JumpLength.size() - 2)) {
                String temp1 = temp + " m, ";
                System.out.print(temp1);
            }

            String temp2 = this.JumpLength.get(this.JumpLength.size() - 1) + " m";
            System.out.print(temp2);
        }
        else{
            String temp1 = this.JumpLength.get(0)+" m";
            System.out.print(temp1);
        }

    }

    public Athlete(String name) {
        this.name = name;
        this.points = 0;
        this.JumpLength = new ArrayList<Integer>();
    }

    public void setPoints(int points) {
        this.points = this.points + points;
    }

    public void jump(int length) {
        this.JumpLength.add(length);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + points + " points)";
    }

    @Override
    public int compareTo(Athlete o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.points - o.points;
    }

}
