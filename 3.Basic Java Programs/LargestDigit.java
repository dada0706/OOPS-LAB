public class LargestDigit {
    public static void main(String[] args) {
        int num = 987123, max = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit > max) max = digit;
            num /= 10;
        }
        System.out.println("Largest digit: " + max);
    }
}