interface Communicable {
    void sendMessage(String message);
    void receiveMessage(String message);
    void call(String contact);
}
class MobilePhone implements Communicable {
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
    public void call(String contact) {
        System.out.println("Calling " + contact + "...");
    }
}
    public class Phones{
    public static void (String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.sendMessage("Hello!");
        phone.receiveMessage("Hey, how are you?");
        phone.call("Hussain");
 }   
}
