class Hotel {
    String hotelName;
    int rating;

    Hotel() {
        this.hotelName = "Default Hotel";
        this.rating = 3;
    }

    Hotel(String hotelName) {
        this.hotelName = hotelName;
        this.rating = 4;
    }

    Hotel(String hotelName, int rating) {
        this.hotelName = hotelName;
        this.rating = rating;
    }

    void showDetails() {
        System.out.println("Hotel: " + hotelName + ", Rating: " + rating + " stars");
    }
}
public class HotelConstructorOverloading{
    public static void main(String[] args) {
        Hotel h1 = new Hotel();
        Hotel h2 = new Hotel("Grand Palace");
        Hotel h3 = new Hotel("Seaside Resort", 5);

        h1.showDetails();
        h2.showDetails();
        h3.showDetails();
    }
}
