class Book{
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo(){
        System.out.println("Title : "+title);
        System.out.println("Publication Year : "+publicationYear);
        System.out.println();
    }
}

class Author extends Book{
    private String name;
    private String bio;

    public Author(String title, int publicationYear,String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;

    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author Name : "+name);
        System.out.println("Bio : "+bio);
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Book book1 = new Author("The Hero", 2025, "Jerry", "Hello World!");
        book1.displayInfo();
    }
}
