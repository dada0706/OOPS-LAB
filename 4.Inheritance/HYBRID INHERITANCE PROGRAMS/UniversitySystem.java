class University {
    void universityInfo() {
        System.out.println("This is a top-ranked university.");
    }
}

class Department extends University {
    void departmentInfo() {
        System.out.println("Department: Computer Science");
    }
}

class Professor extends University {
    void professorInfo() {
        System.out.println("Professor: Dr. Smith, Expert in AI.");
    }
}

class Student extends Department {
    String studentName;

    Student(String name) {
        this.studentName = name;
    }

    void studentInfo() {
        System.out.println("Student Name: " + studentName);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student s = new Student("John Doe");
        Professor p = new Professor();

        System.out.println("--- Student Details ---");
        s.universityInfo();
        s.departmentInfo();
        s.studentInfo();

        System.out.println("\n--- Professor Details ---");
        p.universityInfo();
        p.professorInfo();
    }
}
