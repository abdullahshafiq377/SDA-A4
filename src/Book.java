// Define a class for books that extends LibraryItem
class Book extends LibraryItem {
    private BookType bookType;
    private boolean isBorrowed;

    public Book(String title, String author, String ISBN, BookType bookType) {
        super(title, author, ISBN);
        this.bookType = bookType;
        this.isBorrowed = false;
    }

    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book is already borrowed: " + title);
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not borrowed: " + title);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Type: " + bookType);
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}
