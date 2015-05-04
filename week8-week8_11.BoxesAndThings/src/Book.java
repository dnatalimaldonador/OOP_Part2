/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wenhaowu
 */
public class Book implements ToBeStored{
    private String writer;
    private String name;
    private double weight;
    
    public Book(String writer, String name, double weight){
        this.writer = writer;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public double weight() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.weight;
    }

    @Override
    public String toString() {
        return  writer + ": " + name ;
    }
    
    
}
