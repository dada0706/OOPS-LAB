class Employee {
    String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int empId, String department) {
        super(name, empId);
        this.department = department;
    }

    void display() {
        showDetails();
        System.out.println("Department: " + department);
    }
}
 public class Employer{
    public static void main(String[] args) {
        Manager m = new Manager("Alice Johnson", 1001, "HR");
        m.display();
    }
}
