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
public class Fleet {

private ArrayList<Airplanes> airplanedirectory;
    
    public Fleet() {
       airplanedirectory = new ArrayList<Airplanes>();
    }

    public ArrayList<Airplanes> getAirplanedirectory() {
        return airplanedirectory;
    }

    public void setAirplanedirectory(ArrayList<Airplanes> airplanedirectory) {
        this.airplanedirectory = airplanedirectory;
    }

    
  
    
    public Airplanes addairplane() {
        Airplanes airplane= new Airplanes();
        airplanedirectory.add(airplane);
        return airplane;
    }
    
    public void removeairplane(Airplanes airplanes) {
        airplanedirectory.remove(airplanes);
    }
    
    
}






