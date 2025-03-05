import java.util.*;

class Department{
    private String name;
    private final ArrayList<Faculty> faculties;

    public Department(String name) {
        this.name = name;
        faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
}

class Faculty{
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class University{
    private String name;
    private final ArrayList<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }
    public void addDepartment(String department) {
        departments.add(new Department(department));
    }

    public void addFaculty(String department, Faculty faculty) {
        for (Department d : departments) {
            if (d.getName().equals(department)) {
                d.addFaculty(faculty);
                return;
            }
        }
    }

    public void display(){
        System.out.println("University name: " + name);
        for (Department d : departments) {
            System.out.println("Department: " + d.getName());
        }
    }
}

public class UniversityFacultiesDepartment {
    public static void main(String[] args) {
        University chitkara = new University("Chitkara");

        chitkara.addDepartment("CSE");
        chitkara.addDepartment("ECE");
        chitkara.addDepartment("MBA");

        Faculty f1 = new Faculty("Harry");
        Faculty f2 = new Faculty("Simon");
        Faculty f3 = new Faculty("Jack");

        chitkara.addFaculty("MBA", f1);
        chitkara.addFaculty("ECE", f2);
        chitkara.addFaculty("CSE", f3);


        chitkara.display();
    }
}
