class Student{
    
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name , int rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getRollNumber(){
        return rollNumber;
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public double getMarks(){
        return marks;
    }
    public void setMarks(double marks){
        this.marks = marks;
    }

    public void displayGrade(){
        System.out.println("--------Studnet Report--------");
        System.out.println("Student Name : "+name);
        System.out.println("Student RollNumber : "+rollNumber);
        System.out.println("Student Marks : "+marks);
        System.out.println("Student Grade : "+getGrade());
        System.out.println();
    }

    public char getGrade(){
        if(marks >=80) {
            return 'A';
        }
        else if(marks >=60 && marks <=79){
            return 'B';
        }
        else if(marks >=45 && marks <=59){
            return 'C';
        }
        else if(marks >= 33 && marks <=44){
            return 'D';
        }
        else{
            return 'F';
        }
    }
}
public class StudentReport {
    public static void main(String[] args) {
        Student std = new Student("Ankit", 1, 75);
        System.out.println();
        std.displayGrade();
      
    
        
    }
}
