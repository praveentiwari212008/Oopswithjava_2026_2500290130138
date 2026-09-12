public class DivisionExcepton {
    public static void main(String[] args) {
        
    
    try{
    int a=10;
    int b=0;
     
System.err.println(a/b);
     } catch (ArithmeticException e){
        System.err.println("Cannot divided by Zero");
     }
     System.err.println("Program continue....");
    }
}