class Book{

    public final String ISBN;
    protected String title;
    private String author;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String ISBN){
        this.ISBN = ISBN;
    }

}

 class EBook extends Book{
    public EBook(String ISBN, String title, String author) {
        super(ISBN);
        this.title = title;
        setAuthor(author);
    }

    public void display() {
        System.out.println("ISBN : " + ISBN);
        System.out.println("Title : " + title);
        System.out.println("Author : " + getAuthor());
    }
}


public class BookLibrarySystem {
    public static void main(String[] args) {
        EBook book1 = new EBook("0123456", "The Hero", "Jerry");
        book1.display();
    }
}
