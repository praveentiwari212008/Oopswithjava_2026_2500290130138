
import java.io.FileReader;
import java.util.Scanner;

public class predefinedException1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] arr ={1,2,3,4};
            int i,b;
            FileReader fr = new FileReader("abc.txt");
            i=sc.nextInt();
            b=sc.nextInt();
            System.out.println(arr[i]);
             System.out.println(arr[i]/b);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught is "+ e.getMessage());
        } catch (ArrayIndexOutofBoundsException e){
                System.out.println("Exception caught is "+ e.getMessage());
        }
         
    }
}
