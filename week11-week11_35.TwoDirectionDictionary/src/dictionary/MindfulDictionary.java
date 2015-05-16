/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wenhaowu
 */
public class MindfulDictionary {

    private Map<String, String> D_map;
    private Map<String, String> RD_map;
    private String filename;

    public MindfulDictionary() {
        this.D_map = new HashMap<String, String>();
        this.RD_map = new HashMap<String, String>();
    }

    public MindfulDictionary(String filename) {
        this.D_map = new HashMap<String, String>();
        this.RD_map = new HashMap<String, String>();
        this.filename = filename;
    }

    public boolean load() {
        FileReader FR;
        try {
            FR = new FileReader(this.filename);
            Scanner fileReader = new Scanner(FR);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // the line is split at :
                //System.out.println(parts[0]);     // the part of the line before :
                //System.out.println(parts[1]);     // the part of the line after :

                this.add(parts[0], parts[1]);
            }

            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean save() {
        try {
            FileWriter FW = new FileWriter(this.filename);
            String result = "";

            System.out.println(this.D_map.toString());
            for (String temp : this.D_map.keySet()) {
                String temp1 = temp + ":" + this.D_map.get(temp);
                System.out.println(temp1);
                result += temp1 + "\n";
            }
            System.out.println("result is " + result);
            FW.write(result);
            FW.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public void add(String word, String translation) {
        if (!this.D_map.containsKey(word)) {
            this.D_map.put(word, translation);
        }

        if (!this.RD_map.containsKey(translation)) {
            this.RD_map.put(translation, word);
        }
    }

    public String translate(String word) {

        String result = this.D_map.get(word);

        if (result == null) {
            result = this.RD_map.get(word);
        }

        return result;
    }

    public void remove(String word) {
        /*
         if(!this.D_map.containsKey(word)){
         this.RD_map.remove(word);
         }
         else{
         this.D_map.remove(word);
         }
         */
        String temp = this.RD_map.get(word);

        this.RD_map.remove(word);
        this.D_map.remove(temp);
        temp = this.D_map.get(word);
        this.RD_map.remove(temp);
        this.D_map.remove(word);
    }

    @Override
    public String toString() {
        return "MindfulDictionary{" + "D_map=" + D_map + ", RD_map=" + RD_map + '}';
    }

}
