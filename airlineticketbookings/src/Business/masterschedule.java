/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Pranjal
 */
public class masterschedule {
     
   
    private ArrayList<flightclass> masterflightdirectory;

    public masterschedule() {
        masterflightdirectory=new ArrayList<flightclass>();
    }

    public ArrayList<flightclass> getMasterflightdirectory() {
        return masterflightdirectory;
    }

    public void setMasterflightdirectory(ArrayList<flightclass> masterflightdirectory) {
        this.masterflightdirectory = masterflightdirectory;
    }

   

    
    
    public void addflight(flightclass flight){
            
        masterflightdirectory.add(flight) ;
        
}
    
    public void deleteflight(flightclass flight)
    {
        masterflightdirectory.remove(flight);
    }
    
    
}

    

