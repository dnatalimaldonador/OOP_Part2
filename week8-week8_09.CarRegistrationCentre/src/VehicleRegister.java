
import java.util.ArrayList;
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
public class VehicleRegister {
    private Map<RegistrationPlate, String> owners ;
    
    public VehicleRegister(){
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    
    public boolean add(RegistrationPlate plate, String owner){
        if(!this.owners.containsKey(plate)){
            this.owners.put(plate, owner);
            return true;
        }
        else{
            return false;
        }
        
        
    }
    
    public String get(RegistrationPlate plate){
        return this.owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate){
        if(this.owners.containsKey(plate)){
            this.owners.remove(plate);
            return true;
        }
        else{
            return false;
        }
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate temp: this.owners.keySet()){
            System.out.println(temp);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owner = new ArrayList<String>();
        
        for(RegistrationPlate temp: this.owners.keySet()){
            String temp1 = this.owners.get(temp);
            if(!owner.contains(temp1)){
                owner.add(temp1);
            }
        }
        
        for(String temp2 : owner){
            System.out.println(temp2);
        }
        
    }
}
