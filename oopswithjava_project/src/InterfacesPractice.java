public class InterfacesPractice {
    public static void main(String[] args){
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();
    }
    
}
interface  Animal{
    void sound();
}
class Dog implements Animal{
    public void sound(){
         System.out.println("Dog barks: ");
    }
}
class Cat implements Animal{
   public void sound(){
         System.out.println("Cat meow: ");
    }
}