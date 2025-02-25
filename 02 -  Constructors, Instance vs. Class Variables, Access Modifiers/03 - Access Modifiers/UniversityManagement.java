class Student{

    public int rollNumber;
    protected String name;
    private double cgpa;

    public double getCgpa(){
        return cgpa;
    }
    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }

    Student(){

    }
}

class PostgraduateStudent extends Student{
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

     PostgraduateStudent(int rollNumber, String name, double cgpa){
        this.rollNumber = rollNumber;
        setName(name);
        setCgpa(cgpa);
    }

    public void display(){
        System.out.println("Postgraduate Student");
        System.out.println("Roll No: " + this.rollNumber);
        System.out.println("Name: " + this.name);
        System.out.println("CGPA: " + getCgpa());
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        PostgraduateStudent std = new PostgraduateStudent(21, "Ankit", 9.8);
        std.setCgpa(9.5); //modifying cgpa
        std.display();
    }
}
