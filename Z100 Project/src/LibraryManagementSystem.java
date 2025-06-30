import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return title + " by " + author + (isAvailable ? " (Available)" : " (Not Available)");
    }
}

class Library {
    private ArrayList<Book> books;
    private HashMap<String, Book> borrowedBooks;

    public Library() {
        books = new ArrayList<>();
        borrowedBooks = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void viewBooks() {
        System.out.println("=== Available Books ===");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.setAvailable(false);
                borrowedBooks.put(title, book);
                System.out.println("You borrowed: " + book);
                return;
            }
        }
        System.out.println("Book not available for borrowing.");
    }

    public void returnBook(String title) {
        if (borrowedBooks.containsKey(title)) {
            Book book = borrowedBooks.get(title);
            book.setAvailable(true);
            borrowedBooks.remove(title);
            System.out.println("You returned: " + book);
        } else {
            System.out.println("You have not borrowed this book.");
        }
    }
}

public class LibraryManagementSystem {
    private Library library;
    private Scanner scanner;

    public LibraryManagementSystem() {
        library = new Library();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("=== Library Management System ===");
        System.out.println("1. Add Book");
        System.out.println("2. View Books");
        System.out.println("3. Borrow Book");
        System.out.println("4. Return Book");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    public void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        Book newBook = new Book(title, author);
        library.addBook(newBook);
    }

    public void viewBooks() {
        library.viewBooks();
    }

    public void borrowBook() {
        System.out.print("Enter book title to borrow: ");
        String title = scanner.nextLine();
        library.borrowBook(title);
    }

    public void returnBook() {
        System.out.print("Enter book title to return: ");
        String title = scanner.nextLine();
        library.returnBook(title);
    }

    public void run() {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    borrowBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();
        libraryManagementSystem.run();
    }
}