public class Book {
    //Task 1: book title
    private final String title;

    //Task 1: book author
    private final String author;

    //Task 1: publication year
    private final int publicationYear;

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
}