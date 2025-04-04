class Transport {
    void travel() {
        System.out.println("Traveling via transport.");
    }
}

class Airplane extends Transport {
    void travel() {
        System.out.println("Flying in the sky.");
    }
}

class Train extends Transport {
    void travel() {
        System.out.println("Moving on railway tracks.");
    }
}
public class TransportMethodOverriding{
    public static void main(String[] args) {
        Transport t1 = new Airplane();
        Transport t2 = new Train();

        t1.travel();
        t2.travel();
    }
}
