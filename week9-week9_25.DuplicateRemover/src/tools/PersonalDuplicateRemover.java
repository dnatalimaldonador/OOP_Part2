/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author wenhaowu
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    
    private Set<String> Pset;
    private int dup;
    
    public PersonalDuplicateRemover(){
        this.Pset = new HashSet<String>();
        this.dup = 0;
    }
    
    @Override
    public void add(String characterString) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(this.Pset.contains(characterString)){
            this.dup ++;
        }
        
        this.Pset.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.dup;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.Pset;
    }

    @Override
    public void empty() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /*
        for(String temp : this.Pset){
            this.Pset.remove(temp);
        }
                */
        this.Pset.clear();
        this.dup = 0;
    }
    
}
