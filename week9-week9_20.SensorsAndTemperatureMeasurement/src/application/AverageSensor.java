/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wenhaowu
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> reading;

    public AverageSensor() {

        this.sensors = new ArrayList<Sensor>();
        this.reading = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
        
    }

    @Override
    public boolean isOn() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (Sensor temp : this.sensors) {
            if (!temp.isOn()) {
                return false;
            }
        }

        return true;

    }

    @Override
    public void on() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (Sensor temp : this.sensors) {
            temp.on();
        }
    }

    @Override
    public void off() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (Sensor temp : this.sensors) {
            temp.off();
        }
    }

    @Override
    public int measure() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("wrong");
        }

        int count = 0;
        int sum = 0;

        for (Sensor temp : this.sensors) {
            
            sum += temp.measure();
            count++;
        }
        
        
        int result = sum / (int) count;
        this.reading.add(result);
        return result;
    }

    public List<Integer> readings() {
        //ArrayList<Integer> result = new ArrayList<Integer>();
        
        /*
        for (Sensor temp : this.sensors) {
            result.add(temp.measure());
        }
        */
        
        
        return this.reading;
    }

}
