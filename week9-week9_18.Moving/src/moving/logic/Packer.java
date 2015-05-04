/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Thing;
import moving.domain.Box;

/**
 *
 * @author wenhaowu
 */
public class Packer implements Thing{

    private int volume;

    public Packer(int boxesVolume) {
        this.volume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> result = new ArrayList<Box>();
        int i= 0;
        
        Box temp = new Box(this.volume);
        result.add(temp);
        for(i=0; i<things.size(); i++){
            
            if(!temp.addThing(things.get(i))){
                temp = new Box(this.volume);
                temp.addThing(things.get(i));
                result.add(temp);
            }
        }
        

        
        return result;
    }

    @Override
    public int getVolume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
