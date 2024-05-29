
enum BookType {
    FICTION, NONFICTION, TECHNICAL, SCIENCE
}

public class LibraryApp {
    public static void main(String[] args) {
        // Create a Library instance
        Library library = Library.getInstance();

        // Create some books and add them to the library
        Book book1 = new Book("Effective Java", "Joshua Bloch", "1234567890", BookType.TECHNICAL);
        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", "1234567891", BookType.FICTION);

        library.addBook(book1);
        library.addBook(book2);

        // Create a member and borrow a book
        Member member = new Member("John Doe", "john.doe@example.com");
        member.borrowBook(book1);

        // Display library books
        library.displayBooks();

        // Return the book
        member.returnBook(book1);

        // Display library books again
        library.displayBooks();
    }
}
