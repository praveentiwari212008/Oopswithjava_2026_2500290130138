
import java.util.Scanner;
public class PredefinedException {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr[]={1,2,3};
        int i=obj.nextInt();
        try{
        System.out.println("arr[i]");
        int a=obj.nextInt();
        System.out.println(arr[i]/a);}
        catch(Exception e){
            System.out.println("Exception caught is "+e);
        }
        finally{
            System.out.println("Finally executed");
        }
    }
}
