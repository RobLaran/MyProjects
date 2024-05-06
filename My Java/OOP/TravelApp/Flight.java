package OOP.TravelApp;

public class Flight {
    private int flightNumber;
    private String passengerName;
    private String origin;
    private String destination;
    private String date;
    private int numPassengers;
    private double price;
    private int confirmationNum;

    public Flight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price, int confirmationNum){
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.numPassengers = numPassengers;
        this.price = price;
        this.confirmationNum = confirmationNum;
    }

    public int getFlightNumber(){
        return flightNumber;
    }

    public String getName(){
        return passengerName;
    }

    public String getOrigin(){
        return origin;
    }

    public String getDestination(){
        return destination;
    }

    public String getDate(){
        return date;
    }

    public int getNumPass(){
        return numPassengers;
    }

    public double getPrice(){
        return price;
    }

    public int getConfirmNum(){
        return confirmationNum;
    }

    public void setConfirmNum(int number){
        this.confirmationNum = number;
    }
}
