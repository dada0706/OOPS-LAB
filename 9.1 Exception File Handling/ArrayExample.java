import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index (0-4): ");
        int index = scanner.nextInt();

        try {
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        } finally {
            scanner.close();
        }
    }
}