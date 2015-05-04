/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wenhaowu
 */
public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;
    
    public Purchase(String product, int amount, int unitPrice){
        this.amount = amount;
        this.product = product;
        this.unitPrice = unitPrice;
    }
    
    public Purchase(String product, int unitPrice){
        this.amount = 1;
        this.product = product;
        this.unitPrice = unitPrice;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
    
    
    
    public int price(){
        return this.amount*this.unitPrice;
    }
    
    public void increaseAmount(){
        this.amount ++;
    }

    @Override
    public String toString() {
        return product + ": " + amount ;
    }
    
    
}
