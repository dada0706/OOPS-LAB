public class SumNaturalNumbers {
    public static void main(String[] args) {
        int n = 10, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}