public class PolyPlusAbstractPractice {
    public static void main(String[] args) {
        Payment p1 =new UPI();
        Payment p2 =new CreditCard();
        Payment p3 =new Cash();
        p1.pay(100);
        p2.pay(500);
        p3.pay(1000);
    }
    
}
abstract class Payment{
     public abstract void pay(double amount);
}
class UPI extends Payment{
    
   public void pay(double amount){
        System.out.println("Pay through UPI "+amount);
    }
}
class CreditCard extends Payment{
   public void pay(double amount){
        System.out.println("Pay through  CreditCard "+amount);
    }
}
class Cash extends Payment{
   public void pay(double amount){
        System.out.println("Pay through Cash "+amount);
    }
}