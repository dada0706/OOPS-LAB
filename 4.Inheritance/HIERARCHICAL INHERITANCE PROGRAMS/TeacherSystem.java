class Teacher {
    void teach() {
        System.out.println("Teacher is teaching...");
    }
}

class MathTeacher extends Teacher {
    void explainMath() {
        System.out.println("Math teacher is explaining algebra.");
    }
}

class ScienceTeacher extends Teacher {
    void explainScience() {
        System.out.println("Science teacher is explaining physics.");
    }
}

public class TeacherSystem {
    public static void main(String[] args) {
        MathTeacher mt = new MathTeacher();
        ScienceTeacher st = new ScienceTeacher();

        System.out.println("--- Math Teacher ---");
        mt.teach();
        mt.explainMath();

        System.out.println("\n--- Science Teacher ---");
        st.teach();
        st.explainScience();
    }
}
