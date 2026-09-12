class InvalidPasswordException extends Exception{
        InvalidPasswordException(String msg){
            super(msg);
        }
}
public class PsInvalid {
    public static void main(String[] args) {
        try {
            password(1);
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
    static void password(int p) throws  InvalidPasswordException {
        if(p<8){
            throw new InvalidPasswordException("Password must contain at least 8 characters.");
        }
        System.out.println("Valid password");
    }
     
}
 