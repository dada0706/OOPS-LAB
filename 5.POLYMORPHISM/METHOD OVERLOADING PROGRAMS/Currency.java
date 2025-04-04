class CurrencyConverter {
    double convert(double amount, String currencyType) {
        if (currencyType.equalsIgnoreCase("USD")) {
            return amount * 1.1;
        } else if (currencyType.equalsIgnoreCase("EUR")) {
            return amount * 0.9;
        } else {
            return amount;
        }
    }

    double convert(double amount) {
        return amount * 75.0; // Default conversion to INR
    }
}
public class Currency{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.print("Enter amount in INR: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter currency type (USD/EUR): ");
        String currencyType = sc.nextLine();

        System.out.println("Converted amount: " + converter.convert(amount, currencyType));
        System.out.println("Default conversion to INR: " + converter.convert(amount));

        sc.close();
    }
}
