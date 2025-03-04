import java.util.List;
import java.util.ArrayList;

class Course {
    private String courseName;
    private List<Student> students; // Students enrolled in this course

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.enrollCourse(this); // Ensuring bidirectional association
        }
    }

    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

// Student class (Association: Many-to-Many with Course)
class Student {
    private String name;
    private List<Course> courses; // Courses the student is enrolled in

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this);
        }
    }

    public void showCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

// School class (Aggregation: School has multiple students)
class School {
    private String schoolName;
    private List<Student> students; // Aggregation: School has students

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

public class SchoolStudentCourses {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        // Adding students to the school (Aggregation)
        school.addStudent(student1);
        school.addStudent(student2);

        // Students enrolling in courses (Association)
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Display Information
        school.showStudents();
        student1.showCourses();
        student2.showCourses();
        course1.showStudents();
        course2.showStudents();
    }
}
    
