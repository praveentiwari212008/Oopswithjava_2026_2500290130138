class Hello{
    void display(){
        System.out.println("Hello World");
    }
}
public class HelloWorldUsingOjectAndMethodCalling {
    public static void main(String[] args) {
        Hello obj=new Hello();
        obj.display();
        
    }}
    
/*Java program execution main() method se start karta hai.

Jab JVM tumhara program start karti hai, uske paas initially kisi object ka reference nahi hota.

Agar main() non-static hota:to JVM ko pehle object banana padta. Lekin Java ne decide kiya ki program ka starting point object banaye bina accessible hona chahiye.

Isliye:static

use hota hai.

Matlab JVM directly class ke through main() ko access kar sakti hai:Object ki zarurat nahi. */
