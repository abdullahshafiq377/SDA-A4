// Define a class for library members
class Member implements Borrowable {
    private String name;
    private String email;

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void borrowBook(Book book) {
        if (!book.isBorrowed()) {
            book.borrow();
            System.out.println(name + " borrowed " + book.title);
        } else {
            System.out.println("Book is already borrowed by someone else: " + book.title);
        }
    }

    @Override
    public void returnBook(Book book) {
        if (book.isBorrowed()) {
            book.returnBook();
            System.out.println(name + " returned " + book.title);
        } else {
            System.out.println("Book was not borrowed: " + book.title);
        }
    }
}
