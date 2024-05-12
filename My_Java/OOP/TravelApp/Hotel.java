package OOP.TravelApp;

// ID, a name, a location, a check-in date, a check-out date, a number of guests, a price, and a confirmation number

public class Hotel {
    private int ID;
    private String name;
    private String location;
    private String checkIn;
    private String checkOut;
    private int numGuests;
    private double price;
    private int confirmationNum;

    public Hotel(int ID, String name, String location, String checkIn, String checkOut, int numGuests, double price, int confirmationNum){
        this.ID = ID;
        this.name = name;
        this.location = location;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numGuests = numGuests;
        this.price = price;
        this.confirmationNum = confirmationNum;
    }

    public int getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }

    public String getCheckIn(){
        return checkIn;
    }

    public String getCheckOut(){
        return checkOut;
    }

    public int getNumGueests(){
        return numGuests;
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
