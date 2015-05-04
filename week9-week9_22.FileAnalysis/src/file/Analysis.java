package file;

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
public class Analysis {
    private File f1;
    
    public Analysis(File file){
        this.f1 = file;
    }
    
     public int lines() throws FileNotFoundException{
         Scanner sc = new Scanner(this.f1);
         int count = 0;
         while(sc.hasNextLine()){
             sc.nextLine();
             //System.out.println("here");
             count ++;
         }
         return count;
     }
     
     public int characters() throws FileNotFoundException{
          Scanner sc = new Scanner(this.f1);
          int count=0;
          while(sc.hasNextLine()){
             int len = sc.nextLine().length();
             
             count += len+1;
         }
         
          return count;
     }
}
