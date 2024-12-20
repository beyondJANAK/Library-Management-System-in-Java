import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        String title;
        String author;
        int ISBN;


        while (true) {
            System.out.println("----Library Management System----");
            System.out.println("1. Display all Books");
            System.out.println("2. Add New BOok");
            System.out.println("3. Find a Book");
            System.out.println("4. Check Out a Book");
            System.out.println("5. Return a Book");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Displaying all books: ");
                    library.displayAllBooks();
                    break;
                case 2:
                    System.out.println("Enter the title of the book: ");
                    title = sc.nextLine();
                    System.out.println("Do you want to add author and ISBN too? (y/n): ");
                    boolean addDetails = sc.nextLine().equals("y");
                    if (addDetails) {
                        System.out.println("Enter the author of the book: ");
                        author = sc.nextLine();
                        System.out.println("Enter the ISBN of the book: ");
                        ISBN = sc.nextInt();
                        sc.nextLine();
                        library.addBook(title, author, ISBN);
                    } else {
                        library.addBook(title);
                    }
                    break;
                case 3:
                    System.out.println("Enter the title of the book: ");
                    title = sc.nextLine();
                    System.out.println("Do you want to search by ISBN too? (y/n): ");
                    boolean searchByISBN = sc.nextLine().equals("y");
                    if (searchByISBN) {
                        System.out.println("Enter the ISBN of the book: ");
                        ISBN = sc.nextInt();
                        sc.nextLine();
                        if (library.findBook(title, ISBN)) {
                            System.out.println("Book found!");
                        } else {
                            System.out.println("Book not found!");
                        }
                    } else {
                        if (library.findBook(title)) {
                            System.out.println("Book found!");
                        } else {
                            System.out.println("Book not found!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter the title of the book: ");
                    title = sc.nextLine();
                    if(library.findBook(title)) {
                        System.out.println("Enter your name: ");
                        String name = sc.nextLine();
                        library.checkOutBook(title, name);
                    }
                    break;
                case 5:
                    System.out.println("Enter the title of the book: ");
                    title = sc.nextLine();
                    library.returnBook(title);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}