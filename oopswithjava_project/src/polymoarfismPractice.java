public class polymoarfismPractice {
    public static void  main(String[] args){
        Animal a1=new Dog();
        a1.sound();
        Animal a2 = new Cat();
        a2.sound();
    }
    
}
class Animal{ 
    void sound(){
        System.err.println("Animal sound");

    }
}
class Dog extends Animal{
    
    void sound(){
        System.err.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.err.println("Cat meows");
    }
}