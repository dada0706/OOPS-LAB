interface Trackable {
    void startTracking();
    void stopTracking();
    String getLocation();
}
class GPSDevice implements Trackable {
    private String location = "Unknown";
    public void startTracking() {
        location = "Downtown, City Center";
        System.out.println("GPS tracking started.");
    }
    public void stopTracking() {
        System.out.println("GPS tracking stopped.");
    }
    public String getLocation() {
        return location;
    }
}
   public class Tracker{
    public static void main(String[] args) {
        GPSDevice gps = new GPSDevice();
        gps.startTracking();
        System.out.println("Current location: " + gps.getLocation());
        gps.stopTracking();
    }
}
