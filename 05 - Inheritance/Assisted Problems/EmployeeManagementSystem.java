class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Salary : "+salary);
    }
}

class Manager extends Employee{
   private int teamsize;

    public Manager(String name, int id, double salary, int teamsize) {
            super(name, id, salary);
            this.teamsize = teamsize;
            
        }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("TeamSize : "+teamsize);
    }
}

class Developer extends Employee{
   private String programmingLanguage;
    
    public Developer(String name, int id, double salary,String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
        
    }
    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language : "+programmingLanguage);
    }
    
}

class Intern extends Employee{
    private int duration;
    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Duration : "+duration);
    }

}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
       Employee e1 = new Manager("Ankit", 1, 50000.522, 40);
       Employee e2 = new Developer("Jerry", 2, 45257.256, "Java");
       Employee e3 = new Intern("Shadow", 3, 38756.254, 6);

       e1.displayDetails();
       e2.displayDetails();
       e3.displayDetails();
    }
}
