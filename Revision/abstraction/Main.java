package abstraction;

public class Main {
    public static void main (String [] args){

        PaymentService paymentService = new UpiPaymentService();
        System.out.println(paymentService.makepayment(500));
    }

}
