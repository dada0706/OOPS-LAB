class Payment {
    void transaction() {
        System.out.println("Transaction initiated...");
    }
}

class OnlinePayment extends Payment {
    void processPayment() {
        System.out.println("Online Payment Processed.");
    }
}

class RefundablePayment extends OnlinePayment {
    void processRefund() {
        System.out.println("Refund Processed.");
    }
}
public class Money{
    public static void main(String[] args) {
        RefundablePayment rp = new RefundablePayment();
        rp.transaction();   
        rp.processPayment();
        rp.processRefund();  
    }
}
