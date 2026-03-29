import java.util.ArrayList;

public class User {
    private final String name;
    private final int age;
    private final ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    //borrow book through library
    public void borrowBook(Library library, String title) {
        Book borrowedBook = library.borrowBook(title);
        if (borrowedBook != null) {
            borrowedBooks.add(borrowedBook);
            System.out.println(name + " borrowed: " + borrowedBook.getTitle());
        }
    }

    //return book through library
    public void returnBook(Library library, Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            library.returnBook(book);
            System.out.println(name + " returned: " + book.getTitle());
        }
    }

    //display borrowed books
    public void displayBorrowedBooks() {
        System.out.println(name + "'s borrowed books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No borrowed books.");
            return;
        }

        for (Book book : borrowedBooks) {
            System.out.println("- " + book.getTitle());
        }
    }
}