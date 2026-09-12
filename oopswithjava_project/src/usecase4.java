 public class usecase4 {
    public static void main(String[] args) {
        double balance = 5000.0;
        double withdrawAmount = 7500.0;
 
        // TODO: call withdraw() inside a try block,
        // catch InsufficientBalanceException,
        // and use finally to print "Transaction attempt completed."
    }
 
    static void withdraw(double balance, double amount) /* complete signature */ {
        // TODO: throw InsufficientBalanceException if amount > balance
        // otherwise print "Withdrawal successful. New balance: " + (balance - amount)
        if(amount>balance) throw new InsufficientBalanceException("Blance Insufficient");
        else{
            balance = balance - amount;
            System.out.println("withdrawal successful with balance"+Balance)
        }
    }
}

    
