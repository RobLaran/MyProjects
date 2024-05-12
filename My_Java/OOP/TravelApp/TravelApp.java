package OOP.TravelApp;

import java.util.ArrayList;
import java.util.Random;

public class TravelApp {
    private ArrayList<Flight> flights;
    private ArrayList<Hotel> hotels;

    public TravelApp(){
        flights = new ArrayList<Flight>();
        hotels = new ArrayList<Hotel>();
    }

    public void searchFlight(String origin, String destination, String date, int numPassengers){
        System.out.println("Searching for flights from " +  origin + " to " + destination + " on " + date + " for " + numPassengers + " passengers.");
    }

    public void searchHotel(String location, String checkIn, String checkOut, int numGuests){
        System.out.println("Searching for hotels in " +  location + " from " + checkIn + " to " + checkOut + " for " + numGuests+ " guests.");
    }

    public void bookFlight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price){
        int confirmationNum = generateConfirmationNum();
        Flight flight = new Flight(flightNumber, passengerName, origin, destination, date, numPassengers, price, confirmationNum);
        flight.setConfirmNum(confirmationNum);
        flights.add(flight);
        System.out.println("Flight booked! Confirmation number: " + confirmationNum);
    }

    public void bookHotel(int ID, String name, String location, String checkIn, String checkOut, int numGuests, double price){
        int confirmationNum = generateConfirmationNum();
        Hotel hotel = new Hotel(ID, name, location, checkIn, checkOut, numGuests, price, confirmationNum);
        hotel.setConfirmNum(confirmationNum);
        hotels.add(hotel);
        System.out.println("Hotel booked! Confirmation number: " + confirmationNum);
    }

    public void cancelReservation(int confirmationNum){
        for(Flight flight: flights){
            if(flight.getConfirmNum() == confirmationNum){
                flights.remove(flight);
                System.out.println("Flight reservation with confirmation number " + confirmationNum + " cancelled.");
            }
        }
        for(Hotel hotel: hotels){
            if(hotel.getConfirmNum() == confirmationNum){
                hotels.remove(hotel);
                System.out.println("Hotel reservation with confirmation number " + confirmationNum + " cancelled.");
            }
        }

        System.out.println("No reservation found with confirmation number: " + confirmationNum);
    }

    public int generateConfirmationNum(){
        Random rand = new Random();
        int number = rand.nextInt(999999);
        return number;
    }
}
