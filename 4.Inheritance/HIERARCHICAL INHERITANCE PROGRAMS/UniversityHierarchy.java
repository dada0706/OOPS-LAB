import java.util.Scanner;

class University {
    String universityName;

    University(String name) {
        this.universityName = name;
    }

    void displayUniversity() {
        System.out.println("University: " + universityName);
    }
}

class Student extends University {
    String studentName;
    int marks;

    Student(String uniName, String studentName, int marks) {
        super(uniName);
        this.studentName = studentName;
        this.marks = marks;
    }

    void displayStudentDetails() {
        displayUniversity();
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks Obtained: " + marks);
        if (marks >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}

class Professor extends University {
    String professorName;
    String subject;

    Professor(String uniName, String professorName, String subject) {
        super(uniName);
        this.professorName = professorName;
        this.subject = subject;
    }

    void displayProfessorDetails() {
        displayUniversity();
        System.out.println("Professor Name: " + professorName);
        System.out.println("Subject: " + subject);
    }
}

public class UniversityHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter university name: ");
        String uniName = sc.nextLine();

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter professor name: ");
        String professorName = sc.nextLine();

        System.out.print("Enter subject taught: ");
        String subject = sc.nextLine();

        Student student = new Student(uniName, studentName, marks);
        Professor professor = new Professor(uniName, professorName, subject);

        System.out.println("\n--- Student Details ---");
        student.displayStudentDetails();

        System.out.println("\n--- Professor Details ---");
        professor.displayProfessorDetails();

        sc.close();
    }
}
