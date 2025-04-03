class Person {
    void display() {
        System.out.println("Person Details");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("Employee is working.");
    }
}

class Intern extends Employee {
    void study() {
        System.out.println("Intern is studying.");
    }
}
public class Multi{
    public static void main(String[] args) {
        Intern intern = new Intern();
        intern.display(); 
        intern.work();    
        intern.study();  
    }
}
