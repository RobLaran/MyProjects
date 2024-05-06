package OOP.Movies;

import java.util.ArrayList;

public class Movie {

    private String movieTitle;
    private String director;
    private String actor;
    private ArrayList<Review> reviews;

    public Movie(String movieTitle, String director, String actor){
        this.movieTitle = movieTitle;
        this.director = director;
        this.actor = actor;
        reviews = new ArrayList<Review>();
    }

    public String getTitle(){
        return movieTitle;
    }

    public String getDirector(){
        return director;
    }

    public String getActor(){
        return actor;
    }

    public void addReview(Review review){
        reviews.add(review);
    }

    public ArrayList<Review> reviewList(){
        return reviews;
    }


}
