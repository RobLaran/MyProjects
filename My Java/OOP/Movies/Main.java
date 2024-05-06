package OOP.Movies;

// Write a Java program to create a class called " Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews

// The above Movie class has instance variables for the movie's title, director, actors, and reviews. The class constructor takes in the movie's title, director, and actors as parameters, and initializes the instance variables. The class also has methods to add a review to the movie's reviews list. It can retrieve the reviews list, and the movie's title, director, and actors. The reviews list is an ArrayList of Review objects, created outside of this class. These objects are added to the reviews list using the addReview() method.

// The Review class represents a movie review, with attributes such as the review text, the reviewer's name, and the rating given to the movie. It has a constructor that takes these attributes as parameters and sets them as instance variables. The class also has three getter methods to retrieve review text, reviewer name, and rating

// The Main class is the entry point for the program. It creates two  Movie objects: movie1 and movie2. It also creates five Review objects: review1, review2, review3, review4, and review5. movie1 represents the movie "Titanic" directed by James Cameron and starring Leonardo DiCaprio and Kate Winslet. It adds four reviews to its reviews ArrayList. movie2 represents the movie "The Godfather" directed by Francis Ford Coppola and starring Marlon Brando, Al Pacino, and James Caan. It adds three reviews to its reviews ArrayList.

// The Main class then displays all the reviews for movie1 and movie2 by iterating over their reviews ArrayList and printing out the review text, reviewer name, and rating.

// Sample Output:

// Reviews for 'Titanic':
// Great movie! by Irvine Rolf - 4.5
// Highly recommended! by Ashkii Karlheinz - 4.5
// A classic that never gets old. by Nele Athol - 4.0
// Great movie! by Cipactli Anselma - 4.0

// Reviews for 'The Godfather':
// Great movie! by Irvine Rolf - 4.5
// Great movie! by Cipactli Anselma - 4.0
// Highly recommended! by Martin Nadine - 4.0

public class Main {
    
    public static void main(String[] args) {

        // Movies
        Movie movie1 = new Movie("Titanic", "James Cameron", "Leonardo DiCaprio and Kate Winslet");
        Movie movie2 = new Movie("The Godfather", "Francis Ford Coppola", "Marlon Brando, Al Pacino, and James Caan");
        
        // Reviews
        Review review1 = new Review("Great movie!", "Irvine Rolf", 4.5);
        Review review2 = new Review("Highly recommended!", "Ashkii Karlheinz", 4.5);
        Review review3 = new Review("A classic that never gets old.", "Nele Athol", 4.0);
        Review review4 = new Review("Great movie!", "Cipactli Anselma", 4.0);
        Review review5 = new Review("Highly recommended!", "Martin Nadine", 4.0);

        // Adding reviews to the movie
        movie1.addReview(review1);
        movie1.addReview(review2);
        movie1.addReview(review3);
        movie1.addReview(review4);

        movie2.addReview(review1);
        movie2.addReview(review4);
        movie2.addReview(review5);

        System.out.println("Reviews for '" + movie1.getTitle() + "':");
        for(Review r: movie1.reviewList()){
            System.out.println(r.getReview() + " by " + r.getReviewer() + " - " + r.getRating());
        }
        System.out.println();
        System.out.println("Reviews for '" + movie2.getTitle() + "':");
        for(Review r: movie2.reviewList()){
            System.out.println(r.getReview() + " by " + r.getReviewer() + " - " + r.getRating());
        }
    }
}
