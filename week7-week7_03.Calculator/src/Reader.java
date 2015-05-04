
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wenhaowu
 */
public class Reader {
    private Scanner sca;
    
    public Reader (){
        this.sca = new Scanner(System.in);
    }
    
    public String readString(){
        String result = "";
        result = this.sca.nextLine();
        return result;  
    }
    
    public int readInteger(){
        String result;
        result = this.sca.nextLine();
        return Integer.parseInt(result);
    }
    
    
    
    
}
