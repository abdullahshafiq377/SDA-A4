import java.util.ArrayList;
import java.util.List;

// Define a singleton class for the library
class Library {
    private static Library instance;
    private List<Book> books;

    private Library() {
        books = new ArrayList<>();
    }

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    public void displayBooks() {
        System.out.println("Library books:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}
