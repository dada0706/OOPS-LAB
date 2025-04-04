class TemperatureConverter {
    private double celsius;

    public TemperatureConverter(double celsius) {
        this.celsius = celsius;
    }

    public void setTemperatureCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getTemperatureCelsius() {
        return celsius;
    }

    public double getTemperatureFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    public void setTemperatureFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5/9;
    }
}
   public class Main{
    public static void main(String[] args) {
        TemperatureConverter temp = new TemperatureConverter(25);
        System.out.println(temp.getTemperatureFahrenheit());
        temp.setTemperatureFahrenheit(100);
        System.out.println(temp.getTemperatureCelsius());
    }
}
