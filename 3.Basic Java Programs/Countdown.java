public class Countdown {
    public static void main(String[] args) throws InterruptedException {
        int start = 10;
        for (int i = start; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // Delay for 1 second
        }
        System.out.println("Time's up!");
    }
}