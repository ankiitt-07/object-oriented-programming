public class Person {
    private String name;
    private int age;

    Person(){
        System.out.println("default constructor");
    }

    Person(String name , int age){
        this.name = name ;
        this.age = age;
    }

    Person(Person p){
        this.name = p.name;
        this.age = p.age;
    }

    public void display(){
        System.out.println("Name : "+name + " , Age : "+age);
    }
    public static void main(String[] args) {
        Person p1 = new Person("Ankit" ,22);
        p1.display();
        Person p2 = new Person(p1);
        p2.display();

    }
}
