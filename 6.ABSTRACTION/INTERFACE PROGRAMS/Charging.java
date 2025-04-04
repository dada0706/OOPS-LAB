
interface Chargeable {
    void charge();
    void stopCharging();
    int batteryLevel();
}
class ElectricCar implements Chargeable {
    private int battery = 50; 
    public void charge() {
        battery = 100;
        System.out.println("Electric car is fully charged.");
    }
    public void stopCharging() {
        System.out.println("Charging stopped at " + battery + "%.");
    }
    public int batteryLevel() {
        return battery;
    }
}
   public class Charging{
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        System.out.println("Battery level: " + car.batteryLevel() + "%");
        car.charge();
        car.stopCharging();
    }
}
