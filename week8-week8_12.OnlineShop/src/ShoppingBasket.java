
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
public class ShoppingBasket {

    private Map<String, Purchase> mPurchase;

    public ShoppingBasket() {
        this.mPurchase = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {

        if (this.mPurchase.containsKey(product)) {
            //this.mPurchase.put(product, new Purchase(product , price));
            this.mPurchase.get(product).increaseAmount();
        } else {
            Purchase temp = new Purchase(product, price);
            this.mPurchase.put(product, temp);
        }

    }

    public int price() {
        int result = 0;

        for (Purchase temp : this.mPurchase.values()) {
            result += temp.price();
        }

        return result;
    }

    public void print() {
        for (Purchase temp : this.mPurchase.values()) {
            System.out.println(temp);
        }
    }
}
