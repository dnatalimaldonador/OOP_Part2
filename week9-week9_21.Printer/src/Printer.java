
import java.io.File;
import java.io.FileNotFoundException;
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
public class Printer {
    
    private File f1; 
    
    public Printer(String fileName) throws Exception{
        this.f1 = new File(fileName);
    }
    
    public void printLinesWhichContain(String word) throws FileNotFoundException {
        
        Scanner reader = new Scanner(this.f1);
        
        while(reader.hasNextLine()){
            String sTemp = reader.nextLine();
            if(sTemp.contains(word)){
                System.out.println(sTemp);
                //System.out.println("true");
            }
            
        }
        
        reader.close();
        
    }
}
