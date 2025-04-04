class Patient {
    String name;
    int age;

    Patient() {
        this.name = "Unknown";
        this.age = 0;
    }

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println("Patient Name: " + name + ", Age: " + age);
    }
}
public class main PatientCostructor{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter patient name: ");
        String patientName = sc.nextLine();

        System.out.print("Enter patient age: ");
        int patientAge = sc.nextInt();

        Patient p1 = new Patient();
        Patient p2 = new Patient(patientName, patientAge);

        p1.showInfo();
        p2.showInfo();

        sc.close();
    }
}
