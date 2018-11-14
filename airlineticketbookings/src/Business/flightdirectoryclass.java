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
public class flightdirectoryclass {
   
    private ArrayList<flightclass> flightdirectory;

    public flightdirectoryclass() {
        flightdirectory=new ArrayList<flightclass>();
    }

    public ArrayList<flightclass> getFlightdirectory() {
        return flightdirectory;
    }

    public void setFlightdirectory(ArrayList<flightclass> flightdirectory) {
        this.flightdirectory = flightdirectory;
    }

    
    
    public flightclass addflight(){
            flightclass flight=new flightclass();
        flightdirectory.add(flight) ;
        return(flight);
}
    
    public void deleteflight(flightclass flight)
    {
        flightdirectory.remove(flight);
    }
    
    
}
