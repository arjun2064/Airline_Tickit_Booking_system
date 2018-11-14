/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


public class airlinerclass {

   

    
    private String AirlinerName;
    private Fleet fleet;
    private flightdirectoryclass flightdirectory;
    
    public airlinerclass() {
        flightdirectory = new flightdirectoryclass();
        fleet=new Fleet();
        
    }

    public flightdirectoryclass getFlightdirectory() {
        return flightdirectory;
    }

    public String getAirlinerName() {
        return AirlinerName;
    }

    public void setAirlinerName(String AirlinerName) {
        this.AirlinerName = AirlinerName;
    }
    
     public Fleet getFleet() {
        return fleet;
       
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }
    
    @Override
    public String toString()
    {
    return this.AirlinerName;
    }

    
}