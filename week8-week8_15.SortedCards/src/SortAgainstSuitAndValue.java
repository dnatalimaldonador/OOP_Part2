/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wenhaowu
 */
import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {
    public int compare(Card card1, Card card2) {
        int result = card1.getSuit()-card2.getSuit();
        if(result == 0){
            result = card1.getValue() - card2.getValue();
            return result;
        }
        return result;
    }
}
     
