public class Book {
    private String title;
    private String author;
    private int ISBN;
    private boolean isAvailable;

    public Book(String title, String author, int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.ISBN = 0;
        this.isAvailable = true;
    }

    public Book() {

    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setTitle(String title) {
        if(title != null){
            this.title = title;
        }
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void checkOut() {
        this.isAvailable = false;
        System.out.println("Book checked out successfully!");
    }

    public void checkOut(String borrowerName) {
        this.isAvailable = false;
        System.out.println("The book is taken by: " + borrowerName);
    }

    public void returnBook() {
        this.isAvailable = true;
    }
}
