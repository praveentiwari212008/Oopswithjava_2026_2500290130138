
import java.util.Scanner;

class A{
    static void Sum(int a,int b){
        System.out.println("Sum "+ (a+b));
    }
    static void Diffrence(int a,int b){
        System.out.println("Diffrence "+ (a-b));
    }
    static void product(int a,int b){
        System.out.println("Product "+ (a*b));
    }
    static void Division(int a,int b){
        if(b!=0){
        System.out.println("Divison "+ (a/b));
    }else{
        System.out.println("Invalid input");
    }
    
}}
public class Operations {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two values");
        int x=obj.nextInt();
        int y=obj.nextInt();
        A.Sum(x,y);
          A.Diffrence(x,y);
            A.product(x,y);
              A.Division(x, y);
              

    }
}
