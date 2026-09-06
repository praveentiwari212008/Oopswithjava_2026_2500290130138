class Account{
    int accountNo;
    private int accountBalance;
    public Account(int accountNo,int accountBalance){
        this.accountNo=accountNo;
        if(accountBalance > 0 && accountBalance <=5000){
            this.accountBalance=5000-accountBalance;
        }
    }
    public void getDetails(){
        System.err.println("AccountNO: "+accountNo);
        System.err.println("AccountBalance: "+accountBalance);
    }

}
public class EncapsulationPractice {
    public static void main(String[] args) {
        Account obj1=new Account(12678499, 2000);
        obj1.getDetails();
    }
}
