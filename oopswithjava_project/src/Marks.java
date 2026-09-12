
class InvalidMarksException extends Exception {
    InvalidMarksException(String s){
        super(s);
    }
}
 public class Marks {
    public static void main(String[] args) {
        try {
            marks(200);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
    static void  marks(int m) throws InvalidMarksException {
        if(m<0 && m>100 ){
            throw new InvalidMarksException("\"Invalid marks! Marks should be between 0 and 100.\"");
        }
        System.out.println("Valid marks");
    }
    
}
 