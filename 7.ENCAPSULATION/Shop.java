class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be positive.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void displayProductInfo() {
        System.out.println("Product: " + productName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

public class Shop {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1200.00, 5);
        product.displayProductInfo();
        product.setPrice(1100.00);
        product.setQuantity(10);
        product.displayProductInfo();
    }
}