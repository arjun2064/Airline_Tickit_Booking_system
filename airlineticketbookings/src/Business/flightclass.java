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
public class flightclass {
    private String FlightID;
    private String Flightname;
    private String Source;
    private String Destination;
    private String Departure;
    private String Arrival;
    private String Flightcharges;
    private Airplanes airplane;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    private int noOfSeats;
            
    
    private ArrayList<Seats> seatsdirec;
    
    public flightclass() {
        seatsdirec = new ArrayList();
        this.airplane= null;

    }
    
    

    public ArrayList<Seats> getSeatsdirec() {
        return seatsdirec;
    }

    public void setSeatsdirec(ArrayList<Seats> seatsdirec) {
        this.seatsdirec = seatsdirec;
    }
    
    public String getFlightID() {
        return FlightID;
    }

    public void setFlightID(String FlightID) {
        this.FlightID = FlightID;
    }

    public String getFlightname() {
        return Flightname;
    }

    public void setFlightname(String Flightname) {
        this.Flightname = Flightname;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getDeparture() {
        return Departure;
    }

    public void setDeparture(String Departure) {
        this.Departure = Departure;
    }

    public String getArrival() {
        return Arrival;
    }

    public void setArrival(String Arrival) {
        this.Arrival = Arrival;
    }

    public String getFlightcharges() {
        return Flightcharges;
    }

    public void setFlightcharges(String Flightcharges) {
        this.Flightcharges = Flightcharges;
    }
    
    public Seats addSeats(){
        if(noOfSeats != 0){
        Seats s = new Seats();
        seatsdirec.add(s);
        noOfSeats--;
        return s;}
        else
            return null;
        
    }

    public Airplanes getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplanes airplane) {
        this.airplane = airplane;
        this.noOfSeats=Integer.parseInt(airplane.getNumberofseats());
    }
    
    
    @Override
    public String toString()
    {
    return this.FlightID;
    }
       
    
}
