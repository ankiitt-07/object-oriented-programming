public class Book {
    
    private String title;
    private String author;
    private double price;

    Book(){
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }

    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAutor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public void displayBook(){
        System.out.println("--------Book Details--------");
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.displayBook();
        System.out.println();
        Book b2 = new Book("The Hero", "Jerry", 101.7);
        b2.displayBook();
    }
}
