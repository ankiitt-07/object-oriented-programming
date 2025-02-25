import java.util.*;

class Book{
    private String title;
    private String author;
    private double price;

    public  Book(String title , String author , double price){
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

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    
    public double getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public void display(){
        System.out.println("--------Book Details--------");
        System.out.println("Title : "+ title);
        System.out.println("Author name : "+ author);
        System.out.println("Price :  "+ price);
    }
}
public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the title : ");
        String title = sc.nextLine();
        System.out.print("Enter the author name : ");
        String auhtor = sc.nextLine();
        System.out.print("Enter the price : ");
        double price = sc.nextDouble();
        System.out.println();
        
        Book mybook = new Book(title, auhtor, price);
        mybook.display();
    }
}
