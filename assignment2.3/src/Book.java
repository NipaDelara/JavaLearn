import java.util.ArrayList;

public class Book {
    //Task 1: book title author publication year
    private final String title;
    private final String author;
    private final int publicationYear;

    // Task 4: rating and reviews
    private double rating;
    private final ArrayList<Object> reviews = new ArrayList<>();

    //Task 1: constructor
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Task 1:get title
    public String getTitle() {
        return title;
    }

    //Task 1: get author
    public String getAuthor() {
        return author;
    }

    //Task 1: get publication year
    public int getPublicationYear() {
        return publicationYear;
    }

    // Task 4: set rating
    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }
    // Task 4: add review
    public void addReview(String review) {
        reviews.add(review);
    }
    // Task 5: get number of reviews
    public int getReviewCount() {
        return reviews.size();
    }

    // display reviews
    public void displayReviews() {
        System.out.println("Reviews for \"" + title + "\":");
        for (Object review : reviews) {
            System.out.println("- " + review);
        }
    }

}