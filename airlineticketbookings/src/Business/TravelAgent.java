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
public class TravelAgent 
{
    private Customerdirectory cd;
    private airlinerdirectory ad;
    private masterschedule ms;

    public Customerdirectory getCd() {
        return cd;
    }

    public airlinerdirectory getAd() {
        return ad;
    }

    public masterschedule getMs() {
        return ms;
    }


public TravelAgent()
    {
        ad=new airlinerdirectory();
        cd=new Customerdirectory();
        ms=new masterschedule();
        
    }
}
