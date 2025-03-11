public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 2, exp = 5, result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        System.out.println(base + "^" + exp + " = " + result);
    }
}