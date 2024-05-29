// Define an abstract class for a library item
abstract class LibraryItem {
    protected String title;
    protected String author;
    protected String ISBN;

    public LibraryItem(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public abstract void displayInfo();
}
