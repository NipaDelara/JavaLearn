import java.util.ArrayList;

public class Library {
    //Task 1:arraylist to store books
    private final ArrayList<Book> books = new ArrayList<>();

    //Task 1: add book
    public void addBook(Book book) {
        books.add(book);
    }

    //Task 1: display all books
    public void displayBooks() {
        System.out.println("Library Catalog:");

        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println((i + 1) + ". Title: \"" + book.getTitle()
                    + "\", Author: \"" + book.getAuthor()
                    + "\", Year: " + book.getPublicationYear());
        }
    }

    //Task 1:find books by author
    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by Author \"" + author + "\":");

        boolean found = false;

        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Title: \"" + book.getTitle()
                        + "\", Year: " + book.getPublicationYear());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found by this author.");
        }
    }

    // Task 2: borrow book by title
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println("Book borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not available: " + title);
    }

    // Task 2: return book
    public void returnBook(Book book) {
        books.add(book);
        System.out.println("Book returned: " + book.getTitle());
    }

    // Task 3: check availability
    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }
}