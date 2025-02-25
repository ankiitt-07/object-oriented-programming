class Employee{

    public String employeeId;
    protected String department;
    private double salary;

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    protected Employee(String employeeId, String department, double salary) {
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }
}

class Manager extends Employee{
    public Manager(String employeeId, String department, double salary) {
        super(employeeId, department, salary);
    }

    public void display() {
        System.out.println("--------Employee Records--------");
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Department Name : " + department);
        System.out.println("Salary : " + getSalary());
    }
}
public class EmployeeRecords {
    public static void main(String[] args) {
        Manager m1 = new Manager("07", "Pharmacy", 25723.50);

        m1.display();
    }
}
