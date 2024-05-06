package OOP.TravelApp;

// Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.

// The above TravelApp class is used for searching and booking flights and hotels, as well as cancelling reservations. It contains methods to search for flights and hotels based on specific criteria, book flights and hotels by creating new Flight and Hotel objects, cancel reservations by confirmation number, and generate a random confirmation number using the Random class in Java. It also contains private instance variables to store ArrayLists of Flight and Hotel objects that represent the current reservations.

//  Imported utilities
//  import java.util.ArrayList;
//  import java.util.Random;

// The above “Flight” class represents a flight. It has flight number, passenger name, origin, destination, date, number of passengers, price, and confirmation number. It has a constructor to create a Flight object and getters and setters to access and modify the object's properties. The confirmation number is set after a flight is booked to identify a reservation.

// The above “Hotel” class represents a hotel, with an ID, a name, a location, a check-in date, a check-out date, a number of guests, a price, and a confirmation number. It contains a constructor that initializes these properties, as well as getter and setter methods for each property. The confirmation number is randomly generated and set through the setter method.

// In the main() method of the above class, an instance of the “TravelApp” class is created. Several methods of the “TravelApp” class are called to perform various tasks related to travel. These tasks include searching for flights and hotels, booking flights and hotels, and cancelling reservations.

// In particular, the “searchFlights()” method is called with the arguments "New York", "London", "2022-09-01", and 1, to search for flights from New York to London on September 1, 2022 for one passenger. Similarly, the “searchHotels()” method is called with the arguments "London", "2022-08-01", "2022-09-05", and 2, to search for hotels in London from August 1, 2022 to September 5, 2022 for two guests.

// Then, two flights and one hotel are booked using the “bookFlight()” and “bookHotel()” methods respectively, with different arguments. Finally, a reservation for one of the flights is cancelled using the “cancelReservation()” method with the argument 12345670.

// Sample Output:

// Searching for flights from New York to London on 2022-09-01 for 1 passengers.
// Searching for hotels in London from 2022-08-01 to 2022-09-05 for 2 guests.
// Flight booked! Confirmation number: 528140
// Flight booked! Confirmation number: 664315
// Hotel booked! Confirmation number: 392396
// No reservation found with confirmation number 12345670.

public class Main {
    public static void main(String[] args) {
        
        TravelApp app = new TravelApp();

        app.searchFlight("New York", "London", "2022-09-01", 1);
        app.searchHotel("London", "2022-08-01", "2022-09-05", 2);
        app.bookFlight(12345670, "Martin Nadine", "New York", "London", "2022-08-01", 1, 700.00);
        app.bookFlight(67843513, "Jennifer Ulrike", "New York", "London", "2022-08-01", 1, 655.00);
        app.bookHotel(98765432, "Martin Nadine", "London", "2022-09-01", "2022-09-05", 1, 100.00);

        app.cancelReservation(12345670);
    }
}
