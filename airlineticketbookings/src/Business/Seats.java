/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author namra
 */
public class Seats 
{
    private String seatNum;
    private float price;
    private customer c;
    
    public Seats(){
        c= null;
    }

    public customer getC() {
        return c;
    }

    public void setC(customer c) {
        this.c = c;
    }
    
    

    public String getSeatNum() {
        return seatNum;
        
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}