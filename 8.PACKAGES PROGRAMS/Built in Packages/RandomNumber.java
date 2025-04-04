import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        int count = 10;

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(100);
            numbers.add(randomNumber);
        }

        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println("Generated Random Numbers: " + numbers);
        System.out.println("Average: " + average);
    }
}