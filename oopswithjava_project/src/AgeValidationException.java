
import java.util.Scanner;

public class AgeValidationException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter age");
        int a=sc.nextInt();
        try {
        cheakAge(a);
        } catch (AgeInvalidException e){
            System.err.println(e);
        } finally{
            sc.close();
        }
    }
   static  void cheakAge(int age) throws AgeInvalidException{
        if(age<18) throw new AgeInvalidException("Age is not valid to vote");
        System.err.println("Eligible to vote");
    }
}
class AgeInvalidException extends Exception{
    AgeInvalidException(String msg){
        super(msg);
    }
}
