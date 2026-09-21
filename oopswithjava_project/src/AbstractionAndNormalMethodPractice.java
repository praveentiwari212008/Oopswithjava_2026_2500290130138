public class AbstractionAndNormalMethodPractice {
    public static void main(String[] args) {
    Vehicle obj1 = new Car();
    obj1.start();
    obj1.stop();
         Vehicle obj2 = new Bike();
    obj2.start();
    obj2.stop();
    }
    
}
abstract class Vehicle{
    abstract void start();
    void stop(){
        System.out.println("Vehicle stopped: ");
    }
}
class Car extends Vehicle{
   @Override 
    void start() {
        System.out.println("Car started: ");
    }
}
class Bike extends Vehicle{
 @Override 
    void start() {
        System.out.println("Bike started: ");
    }
}
 
