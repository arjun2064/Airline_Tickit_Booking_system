/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author namra
 */
public class Customerdirectory 
{
    private ArrayList<customer> arrayOfCustomers;
    
    
    public Customerdirectory()
    {
        arrayOfCustomers = new ArrayList<customer>();
    }

    public ArrayList<customer> getArrayOfCustomers() 
    {
        return arrayOfCustomers;
    }

        
    public customer addCustomer()
    {
        customer c = new customer();
        arrayOfCustomers.add(c);
        return c;
    }
    
    
}
