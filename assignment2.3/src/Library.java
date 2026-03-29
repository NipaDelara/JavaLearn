import java.util.ArrayList;

public class Library {
    //Task 1:arraylist to store books
    private final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<User> users = new ArrayList<>();
    //Task 1: add book
    public void addBook(Book book) {
        books.add(book);
    }

    // Task 6: add user
    public void addUser(User user) {
        users.add(user);
    }

    // Task 6: remove user
    public void removeUser(String name) {
        users.removeIf(user -> user.getName().equalsIgnoreCase(name));
    }

    // Task 6: find user
    public User findUser(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    // Task 6: display users
    public void displayUsers() {
        System.out.println("Library Users:");
        for (User user : users) {
            System.out.println("- " + user.getName() + ", Age: " + user.getAge());
        }
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
                    + "\", Year: " + book.getPublicationYear()
                    + ", Rating: " + book.getRating()
                    + ", Reviews: " + book.getReviewCount());
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
    public Book borrowBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(i);
                return book;
            }
        }
        System.out.println("Book not available: " + title);
        return null;
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


    // Task 5: average book rating

    public Object getAverageBookRating() {
        if (books.isEmpty()) {
            return null;

        }
        Book mostReviewed = books.getFirst();
        double total = 0;
        for (Book book : books) {
            total += book.getRating();
        }

        return total / books.size();
    }
    // Task 5: most reviewed book
    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }

        Book mostReviewed = books.getFirst();

        for (Book book : books) {
            if (book.getReviewCount() > mostReviewed.getReviewCount()) {
                mostReviewed = book;
            }
        }

        return mostReviewed;
    }
}