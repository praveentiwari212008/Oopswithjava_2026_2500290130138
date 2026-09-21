public class PracticeQuestionExceptionHandling {
    public static void main(String[] args){
        int balance=10000;
        int amount=3000;
        try{
            withdraw(balance,amount);
        }
        catch(InvalidAmountException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Transaction completed");
        }

    }
    public static void withdraw(int balance,int amount) throws InvalidAmountException{
        if(amount<=0){
           throw new InvalidAmountException("Invalid withdrawal amount");
        }
        if(amount>balance){
            throw new InvalidAmountException("Insufficient balance");
        }
        balance=balance-amount;
        System.out.println("remaining balance: "+balance);
    }
}
class InvalidAmountException extends Exception{
    InvalidAmountException(String m){
        super(m);
    }
}