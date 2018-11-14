/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Pranjal
 */
public class Airplanes {
    
    private String Airplanename;
    private String Numberofseats;

    public String getAirplanename() {
        return Airplanename;
    }

    public void setAirplanename(String Airplanename) {
        this.Airplanename = Airplanename;
    }

    public String getNumberofseats() {
        return Numberofseats;
    }

    public void setNumberofseats(String Numberofseats) {
        this.Numberofseats = Numberofseats;
    }
    @Override
    public String toString()
    {
    return this.Airplanename;
    }
    
}
