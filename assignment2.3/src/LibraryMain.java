public class LibraryMain {
    public static void main(String[] args) {

        //Task 1: create book objects
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);
        Book book4 = new Book("Advanced Java Concepts", "Jane Doe", 2021);

        // Task 4: set ratings
        book1.setRating(4.5);
        book2.setRating(4.8);
        book3.setRating(4.2);

        // Task 4: add reviews
        book1.addReview("Very helpful for beginners.");
        book1.addReview("Easy to understand Java concepts.");

        book2.addReview("Great book for data structures.");
        book3.addReview("Interesting storytelling techniques.");


        //Task 1: create library object
        Library library = new Library();

        //Task 1: add books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Task 1:display all books
        library.displayBooks();

        // Task 5: average rating
        System.out.println("\nAverage Book Rating: " + library.getAverageBookRating());

        // Task 5: most reviewed book
        Book mostReviewed = library.getMostReviewedBook();
        System.out.println("Most Reviewed Book: " + mostReviewed.getTitle());

        // Task 3: check availability
        System.out.println("\nChecking availability:");
        System.out.println("Is 'Data Structures and Algorithms' available? "
                + library.isBookAvailable("Data Structures and Algorithms"));


        //Task 1: search books by author
        library.findBooksByAuthor("Jane Doe");

        // Task 2: borrow a book
        library.borrowBook("Data Structures and Algorithms");

        // display books after borrowing
        System.out.println("\nAfter borrowing a book:");
        System.out.println("Is 'Data Structures and Algorithms' available? "
                + library.isBookAvailable("Data Structures and Algorithms"));

        library.displayBooks();

        // Task 2: return a book
        library.returnBook(book2);

        // display books after returning
        System.out.println("\nAfter returning a book:");
        System.out.println("Is 'Data Structures and Algorithms' available? "
                + library.isBookAvailable("Data Structures and Algorithms"));

        // Task 2: return
        library.returnBook(book2);

        // Show reviews
        System.out.println();
        book1.displayReviews();
    }
}