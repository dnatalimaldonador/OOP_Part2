/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author wenhaowu
 */
public class WordInspection {

    private File f1;

    public WordInspection(File file) {
        this.f1 = file;
    }

    public int wordCount() throws FileNotFoundException {
        Scanner sc = new Scanner(this.f1);
        int count = 0;
        while (sc.hasNextLine()) {
            sc.nextLine();
            //System.out.println("here");
            count++;
        }
        sc.close();
        return count;
    }

    public List<String> wordsContainingZ() throws FileNotFoundException {
        Scanner sc = new Scanner(this.f1);
        List<String> result = new ArrayList<String>();

        while (sc.hasNextLine()) {
            String sTemp = sc.nextLine();
            if (sTemp.contains("z")) {
                result.add(sTemp);
            };
        }
        sc.close();

        return result;
    }

    public List<String> wordsEndingInL() throws FileNotFoundException {
        Scanner sc = new Scanner(this.f1);
        List<String> result = new ArrayList<String>();

        while (sc.hasNextLine()) {
            String sTemp = sc.nextLine();
            if (sTemp.endsWith("l")) {
                result.add(sTemp);
            };
        }
        sc.close();

        return result;
    }

    public List<String> palindromes() throws FileNotFoundException {
        Scanner sc = new Scanner(this.f1);
        List<String> result = new ArrayList<String>();

        while (sc.hasNextLine()) {
            String sTemp = sc.nextLine();
            if (isPalindrome(sTemp)) {
                result.add(sTemp);
            };
        }
        sc.close();

        return result;
    }

    public boolean isPalindrome(String str) {
        String rev = reverse(str);

        if (str.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }

    private String reverse(String text) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String result = "";

        char c;
        int max = text.length() - 1;

        System.out.println(max);

        for (int i = 0; i < max + 1; i++) {

            c = text.charAt(max - i);
            result += c;
        }

        return result;

    }

    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException{
        Scanner sc = new Scanner(this.f1);
        List<String> result = new ArrayList<String>();

        while (sc.hasNextLine()) {
            String sTemp = sc.nextLine();
            if (allVowels(sTemp)) {
                result.add(sTemp);
            };
        }
        sc.close();

        return result;
    }
    
    private boolean allVowels(String str){
        if(str.contains("ä") && str.contains("ö") && str.contains("a") && str.contains("e")
                && str.contains("i") && str.contains("o") && str.contains("u") && str.contains("y")){
            return true;
        }
        return false;
    }
}
