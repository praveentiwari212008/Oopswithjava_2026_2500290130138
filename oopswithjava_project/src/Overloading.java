class  Addition{
    void sum(){
        System.err.println("Addition");
    }
    static void sum(int a,int b){
        System.err.println("Addition: "+(a+b));
    }
    void sum(double a,double b){
        System.err.println("Additon: "+(a+b));
    }
}
public class Overloading {
 public static void main(String[] args) {
    Addition obj1=new Addition();
    obj1.sum();     
     obj1.sum(10,6); 
      obj1.sum(10.1,10.2); 
 }}   

