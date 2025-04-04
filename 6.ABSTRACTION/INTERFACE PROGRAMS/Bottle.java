interface Refillable {
    void refill();
    void use();
}

class WaterBottle implements Refillable {
    private int waterLevel = 0; 

    public void refill() {
        waterLevel = 100;
        System.out.println("Water bottle refilled.");
    }

    public void use() {
        if (waterLevel > 0) {
            System.out.println("Drinking water...");
            waterLevel -= 50; 
        } else {
            System.out.println("Bottle is empty! Please refill.");
        }
    }
}
    public class Bottle{
    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle();
        bottle.use(); 
        bottle.refill();
        bottle.use();
        bottle.use();
    }
}
