import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class SumOfIntegers {
    public static void main(String[] args) {
        String filePath = "numbers.txt";
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;

        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                    numbers.add(number);
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format in line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("Numbers from the file: " + numbers);
        System.out.println("Sum of the numbers: " + sum);
    }
}