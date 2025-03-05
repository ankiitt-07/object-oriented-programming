class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void displayRole() {
        System.out.println("Role: General Person");
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Person teacher = new Teacher("Ankit", 35, "Mathematics");
        Person student = new Student("Jerry", 16, 10);
        Person staff = new Staff("Shadow", 40, "Administration");

        System.out.println("=== Teacher Details ===");
        teacher.displayRole();
        teacher.displayDetails();
        System.out.println();

        System.out.println("=== Student Details ===");
        student.displayRole();
        student.displayDetails();
        System.out.println();

        System.out.println("=== Staff Details ===");
        staff.displayRole();
        staff.displayDetails();
    }
}
