class Employee {

    private static String companyName = "Tech Corp"; 
    private static int totalEmployees = 0; 
    private final int id; 
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) { 
            System.out.println("--------Employee Details--------");
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Aman", "Software Engineer");
        Employee emp2 = new Employee(2, "Adarsh", "Manager");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        Employee.displayTotalEmployees();
    }
}
