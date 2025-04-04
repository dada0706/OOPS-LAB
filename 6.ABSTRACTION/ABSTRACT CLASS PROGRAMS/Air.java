abstract class Spacecraft {
    abstract void launch();
    abstract void land();
}
class Rocket extends Spacecraft {
    void launch() {
        System.out.println("Rocket is launching.");
    }
    void land() {
        System.out.println("Rocket is landing back on Earth.");
    }
}
   public class Air{
    public static void main(String[] args) {
        Rocket rocket = new Rocket();
        rocket.launch();
        rocket.land();
    }
}
