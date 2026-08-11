/*2. Library Management System

Create an ArrayList<Book> for a library.

Features:

Add book
Display all books
Search book by title
Search by author
Issue a book
Return a book
Delete a book
Display available books
Display issued books
Count total books*/


package collection;

import java.util.ArrayList;
import java.util.Scanner;

// Model class representing a single Book
class Book {
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false; // By default, book is available
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    @Override
    public String toString() {
        String status = isIssued ? "Issued" : "Available";
        return "ID: " + id + " | Title: \"" + title + "\" | Author: " + author + " | Status: " + status;
    }
}

// Main class containing system logic and menu driver
public class LibraryManagementSystem {

    private static final ArrayList<Book> bookList = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1.  Add Book");
            System.out.println("2.  Display All Books");
            System.out.println("3.  Search Book by Title");
            System.out.println("4.  Search Book by Author");
            System.out.println("5.  Issue a Book");
            System.out.println("6.  Return a Book");
            System.out.println("7.  Delete a Book");
            System.out.println("8.  Display Available Books");
            System.out.println("9.  Display Issued Books");
            System.out.println("10. Count Total Books");
            System.out.println("11. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline left over

            switch (choice) {
                case 1 -> addBook();
                case 2 -> displayAllBooks();
                case 3 -> searchByTitle();
                case 4 -> searchByAuthor();
                case 5 -> issueBook();
                case 6 -> returnBook();
                case 7 -> deleteBook();
                case 8 -> displayAvailableBooks();
                case 9 -> displayIssuedBooks();
                case 10 -> countTotalBooks();
                case 11 -> System.out.println("Exiting system. Goodbye!");
                default -> System.out.println("Invalid choice! Please select a number between 1 and 11.");
            }
        } while (choice != 11);
    }

    // 1. Add Book
    private static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (findBookById(id) != null) {
            System.out.println("Error: A book with ID " + id + " already exists.");
            return;
        }

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        bookList.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }

    // 2. Display All Books
    private static void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books in the library catalog.");
            return;
        }
        System.out.println("\n--- All Books ---");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    // 3. Search Book by Title
    private static void searchByTitle() {
        System.out.print("Enter Title to search: ");
        String title = sc.nextLine();

        boolean found = false;
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with title matching: " + title);
        }
    }

    // 4. Search Book by Author
    private static void searchByAuthor() {
        System.out.print("Enter Author Name to search: ");
        String author = sc.nextLine();

        boolean found = false;
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Found: " + book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }

    // 5. Issue a Book
    private static void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();

        Book book = findBookById(id);
        if (book == null) {
            System.out.println("Book with ID " + id + " not found.");
        } else if (book.isIssued()) {
            System.out.println("Sorry, this book is already issued!");
        } else {
            book.setIssued(true);
            System.out.println("Book \"" + book.getTitle() + "\" issued successfully!");
        }
    }

    // 6. Return a Book
    private static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt();

        Book book = findBookById(id);
        if (book == null) {
            System.out.println("Book with ID " + id + " not found.");
        } else if (!book.isIssued()) {
            System.out.println("This book was not issued; it is already in the library.");
        } else {
            book.setIssued(false);
            System.out.println("Book \"" + book.getTitle() + "\" returned successfully!");
        }
    }

    // 7. Delete a Book
    private static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId() == id) {
                bookList.remove(i);
                System.out.println("Book removed successfully!");
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }

    // 8. Display Available Books
    private static void displayAvailableBooks() {
        boolean found = false;
        System.out.println("\n--- Available Books ---");
        for (Book book : bookList) {
            if (!book.isIssued()) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available books currently.");
        }
    }

    // 9. Display Issued Books
    private static void displayIssuedBooks() {
        boolean found = false;
        System.out.println("\n--- Issued Books ---");
        for (Book book : bookList) {
            if (book.isIssued()) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books are currently issued.");
        }
    }

    // 10. Count Total Books
    private static void countTotalBooks() {
        int total = bookList.size();
        int issuedCount = 0;

        for (Book book : bookList) {
            if (book.isIssued()) {
                issuedCount++;
            }
        }

        int availableCount = total - issuedCount;

        System.out.println("\n--- Library Statistics ---");
        System.out.println("Total Books: " + total);
        System.out.println("Available Books: " + availableCount);
        System.out.println("Issued Books: " + issuedCount);
    }

    // Helper Utility Method to search book by ID
    private static Book findBookById(int id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}