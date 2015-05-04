/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wenhaowu
 */
public class Change {
    private char fromChar;
    private char toChar;
    
    public Change(char fromCharacter, char toCharacter){
        this.fromChar = fromCharacter;
        this.toChar = toCharacter;
    }
    
    public String change(String str){
        String result="";
        
        for(int i=0; i<str.length();i++){
            char temp = str.charAt(i);
            if(temp == this.fromChar){
                result += this.toChar;
            }
            else{
                result += temp;
            }
        }
        
        return result;
    }
}
