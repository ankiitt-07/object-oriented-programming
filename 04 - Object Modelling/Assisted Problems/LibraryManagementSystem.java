import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayDetails();
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("The Hero", "Jerry");
        Book book2 = new Book("The Killer", "Shadow");
        Book book3 = new Book("Rising Hero", "Shadow");

        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");

        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);

        library1.displayBooks();
        System.out.println();
        library2.displayBooks();
    }
}
