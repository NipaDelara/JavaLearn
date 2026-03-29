public class LibraryMain {
    public static void main(String[] args) {

        //Task 1: create book objects
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);
        Book book4 = new Book("Advanced Java Concepts", "Jane Doe", 2021);

        //Task 1: create library object
        Library library = new Library();

        //Task 1: add books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Task 1:display all books
        library.displayBooks();

        //Task 1: search books by author
        library.findBooksByAuthor("Jane Doe");

        // Task 2: borrow a book
        library.borrowBook("Data Structures and Algorithms");

        // display books after borrowing
        System.out.println("\nAfter borrowing a book:");
        library.displayBooks();

        // Task 2: return a book
        library.returnBook(book2);

        // display books after returning
        System.out.println("\nAfter returning a book:");
        library.displayBooks();
    }
}