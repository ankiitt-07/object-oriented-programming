import java.util.*;

class Course{

    private String name;
    private final ArrayList<Student> students;
    private Professor professor;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void addStudent(Student student) {
        students.add(student);
    }

}

class Professor{
    private String name;
    private String dept;
    private final ArrayList<Course> teaches;

    public Professor(String name, String dept) {
        this.name = name;
        this.dept = dept;
        this.teaches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public ArrayList<Course> getCourses() {
        return teaches;
    }
    public void addCourse(Course course) {
        teaches.add(course);
    }

    public void assignProfessor(Course course) {
        course.setProfessor(this);
        addCourse(course);
    }
}

class Student{
    private static int totalStudents = 0;
    private int id;
    private String name;
    private int age;
    private final ArrayList<Course> courses;

    public Student(String name, int age) {
        totalStudents++;
        this.id = totalStudents;
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
    public void addCourse(Course course) {
        courses.add(course);
    }

    public void enrollCourse(Course course) {
        course.addStudent(this);
        addCourse(course);
    }
}


public class UniversityManagement {
    public static void main(String[] args) {
        Course maths = new Course("Maths");

        Professor p1 = new Professor("Jack", "DAM");

        Student s1 = new Student("Harry", 13);
        Student s2 = new Student("John", 22);

        s1.enrollCourse(maths);
        s2.enrollCourse(maths);

        p1.assignProfessor(maths);

        System.out.println(maths.getProfessor().getName());
    }
}
