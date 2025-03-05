class Animal{
    String name;
    int age;
    
    public void makeSound(){
        System.out.println("Making Sound");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}
 
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}

class Bird extends Animal{
    @Override
    public void makeSound(){
        System.out.println("chi chi");
    }
}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();
        
        dog.makeSound();
        bird.makeSound();
    }


}
