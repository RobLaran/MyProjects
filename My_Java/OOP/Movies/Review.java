package OOP.Movies;

public class Review {

    private String reviewText;
    private String reviewName;
    private double rating;

    public Review(String reviewText, String reviewName, double rating){
        this.reviewText = reviewText;
        this.reviewName = reviewName;
        this.rating = rating;
    }

    public String getReview(){
        return reviewText;
    }

    public String getReviewer(){
        return reviewName;
    }

    public double getRating(){
        return rating;
    } 
}
