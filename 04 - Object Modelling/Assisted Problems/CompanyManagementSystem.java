import java.util.ArrayList;

class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void displayDetails() {
        System.out.println("Employee: " + name + ", Position: " + position);
    }
}

class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String position) {
        employees.add(new Employee(name, position));
    }

    public void displayDetails() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}

class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public Department getDepartment(String deptName) {
        for (Department dept : departments) {
            if (deptName.equals(deptName)) {
                return dept;
            }
        }
        return null;
    }

    public void displayDetails() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.displayDetails();
        }
    }
}

public class CompanyManagementSystem {
    public static void main(String[] args) {
        Company company = new Company("Kamakhya");

        company.addDepartment("IT");
        company.addDepartment("HR");

        Department itDept = company.getDepartment("IT");
        Department hrDept = company.getDepartment("HR");

        if (itDept != null) {
            itDept.addEmployee("Ankit", "Software Engineer");
            itDept.addEmployee("Jerry", "System Administrator");
        }

        if (hrDept != null) {
            hrDept.addEmployee("Shadow", "HR Manager");
        }

        company.displayDetails();
    }
}
