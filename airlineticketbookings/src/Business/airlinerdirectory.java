/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Rushabh
 */
public class airlinerdirectory {
    
    private ArrayList<airlinerclass> airlinerdirec;
    
    public airlinerdirectory() {
        airlinerdirec = new ArrayList<airlinerclass>();
    }

public ArrayList<airlinerclass> getairlinerDict() {
        return airlinerdirec;
    }    
    
    
    public airlinerclass addairliner() {
        airlinerclass airliner= new airlinerclass();
        airlinerdirec.add(airliner);
        return airliner;
    }
    
    public void removeairliner(airlinerclass airline) {
        airlinerdirec.remove(airline);
    }
    
    public airlinerclass searchairliner(String keyWord) {
        for(airlinerclass airliner: airlinerdirec) {
            if(keyWord.equals(airliner.getAirlinerName())) {
                return airliner;
            }
        }
        return null;
    }
    
}
