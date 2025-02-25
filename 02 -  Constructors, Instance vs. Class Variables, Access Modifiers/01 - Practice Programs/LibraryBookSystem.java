class Book{

    private String title;
    private String author;
    private double price;
    private int availability;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailability() {
        return availability;
    }
    public void setAvailability(int availability) {
        this.availability = availability;
    }

     Book(){
        this.title = "";
        this.author = "";
        this.price = 0.0;
        this.availability = 0;
    }

     Book(String title, String author, double price, int availability) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        setAvailability(availability);
    }

    public void borrowBook() {
        if (availability <= 0) {
            System.out.println("Currently Unavailable");
        } else {
            availability--;
            System.out.println("Book borrowed successfully.");
        }
    }

    public void returnBook() {
        setAvailability(getAvailability() + 1);
    }

    public void displayBook() {
        System.out.println("--------Library--------");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
        System.out.println("Availability: " + getAvailability());
    }
}

public class LibraryBookSystem {
    public static void main(String[] args) {
        Book book = new Book("The Hero", "Jerry", 101.7, 1);
        book.borrowBook();
        book.returnBook();

        book.displayBook();
    }
}
