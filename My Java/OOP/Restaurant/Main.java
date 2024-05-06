package OOP.Restaurant;

import java.text.DecimalFormat;

// Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating.

//  Imported Utilities
//  import java.util.ArrayList;

// The above Restaurant class defines a restaurant with menu items, prices, and ratings. It has a constructor that initializes three ArrayLists for the menu items, prices, and ratings. It also has methods to add and remove items from the menu and add ratings for each item. The class also includes a method to calculate the average rating for a given menu item. It also includes a method to display the current menu.

// The Main class contains the main function that creates an object of the Restaurant class and calls its methods to add, remove, and display menu items, as well as add ratings and calculate average ratings for those items.

// Sample Output:

// Menu:
// Burger: $8.99
// Pizza: $10.99
// Salad: $6.0
// Average rating: 4.666666666666667
// Remove 'Pizza' from the above menu.

// Updated menu:
// Burger: $8.99
// Salad: $6.0

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        DecimalFormat dec = new DecimalFormat(".00");

        restaurant.addItem("Burger", 12.99);
        restaurant.addRating("Burger", 4.2);
        restaurant.addRating("Burger", 4.0);
        restaurant.addRating("Burger", 5);

        restaurant.addItem("Spaghetti", 8.99);
        restaurant.addRating("Spaghetti", 4.8);
        restaurant.addRating("Spaghetti", 4);

        restaurant.addItem("Coke Float", 7.50);
        restaurant.addRating("Coke Float", 2);
        restaurant.addRating("Coke Float", 3.3);
        restaurant.addRating("Coke Float", 4);
        restaurant.addRating("Coke Float", 3.8);

        restaurant.addItem("ChickenJoy", 15.00);
        restaurant.addRating("ChickenJoy", 4.2);
        restaurant.addRating("ChickenJoy", 4.9);
        restaurant.addRating("ChickenJoy", 3.9);


        System.out.println("Menu:");
        restaurant.getMenu();
        System.out.println("Average Rating of the Menu: " + dec.format(restaurant.calculateAverageRating()) + "\n");

        System.out.println("Average Rating of the Items:");
        restaurant.getAverage();

        restaurant.removeItem("ChickenJoy");
        System.out.println("\nChickenJoy is removed");

        System.out.println("\n" + "Updated Menu:");
        restaurant.getMenu();
    }
}
