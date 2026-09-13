public class EcpsltnPcts {
    public static void main(String[] args){
         Account obj = new Account(126,1000.00);
         System.out.print("Intial Balance : ");
         obj.getBalance();
         obj.deposit(500);
         System.out.print("After Deposit : ");
           obj.getBalance();
           obj.withdraw(200);
             
        System.out.print("After withdraw : ");
          obj.getBalance();

    }
    
}
class Account{
    private int  AccountNumber;
    private double Balance;
    public Account(int a,double b){
        this.AccountNumber=a;
        this.Balance=b;
    }
     void deposit(double amount){
        Balance=Balance+amount;
     }
    void withdraw(double amount){
         if (amount <= Balance) {
        Balance = Balance - amount;
    } else {
        System.out.println("Insufficient Balance");
    }
}
void getBalance(){
    System.out.println(Balance);
}
}
