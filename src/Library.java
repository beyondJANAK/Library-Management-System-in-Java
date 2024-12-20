import java.util.ArrayList;

public class Library {
    Book book = new Book();
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addBook(String title){
        Book book = new Book(title);
        books.add(book);
    }

    public void addBook(String title, String author, int ISBN) {
        Book book = new Book(title, author, ISBN);
        books.add(book);
    }

    public boolean findBook(String title) {
        boolean bookFound = false;
        for (Book book: books) {
            if(book.getTitle().equals(title)){
                bookFound = true;
                return bookFound;
            }
        }
        return bookFound;
    }

    public boolean findBook(String title, int ISBN) {
        boolean bookFound = false;
        for (Book book: books) {
            if(book.getTitle().equals(title) && book.getISBN() == ISBN) {
                bookFound = true;
                return bookFound;
            }
        }
        return bookFound;
    }

    public void displayAllBooks(){
        int count = 0;
        for (Book book: books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println("Available: " + book.getIsAvailable() + "\n");
            count++;
        }
        if (count == 0) {
            System.out.println("There is no books available in the library.");
        } else {
            System.out.println("Total books: " + count);
        }
    }

    public void checkOutBook(String title, String name) {
        for (Book book: books) {
            if(book.getIsAvailable() && book.getTitle().equals(title)) {
                if (name != null) {
                    book.checkOut(name);
                } else {
                    book.checkOut();
                }
                return;
            }
        }
        System.out.println("Book not found or already checked out!");
    }

    public void returnBook(String title) {
        for (Book book: books) {
            if (!book.getIsAvailable() && book.getTitle().equals(title)) {
                System.out.println("Book returned successfully!");
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found or already returned!");
    }
}
