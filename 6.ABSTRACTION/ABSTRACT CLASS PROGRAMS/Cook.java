
abstract class CookingAppliance {
    abstract void cook();
    abstract void stop();
}
class Microwave extends CookingAppliance {
    void cook() {
        System.out.println("Microwave is heating food.");
    }
    void stop() {
        System.out.println("Microwave is stopped.");
    }
}
   public class Cook{
    public static void main(String[] args) {
        Microwave microwave = new Microwave();
        microwave.cook();
        microwave.stop();
    }
}
