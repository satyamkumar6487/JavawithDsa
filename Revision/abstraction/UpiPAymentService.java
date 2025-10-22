package abstraction;

class  UpiPaymentService  implements PaymentService {

     public String makepayment(double amount){
         return "Payment of" + amount + "done successfully via upi";

}
}
