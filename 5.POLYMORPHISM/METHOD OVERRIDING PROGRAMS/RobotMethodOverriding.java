class Robot {
    void action() {
        System.out.println("Performing generic robot tasks.");
    }
}

class CleaningRobot extends Robot {
    void action() {
        System.out.println("Cleaning the floor efficiently.");
    }
}
public class RobotMethodOverriding{
    public static void main(String[] args) {
        Robot r = new Robot();
        CleaningRobot c = new CleaningRobot();

        r.action();
        c.action();
    }
}
