class Vehicle{
    private String name;
    private int speeds;
public void display(){
    System.err.println("Vehicle: "+name +" is at speed "+speeds);
}
public void move(){
    System.err.println("Vehicle can move: ");
}
public Vehicle(String n,int s){
    name=n;
    speeds=s;
}
}
class Bike extends Vehicle{
    public void wheels(){
        System.err.println("Bike has two wheels");
    }


public Bike(String name,int speeds){
    super(name,speeds);
}

}
class Car extends Vehicle{
    public void wheels(){
        System.err.println("Car has 4 wheels");
    }
    public Car(String name,int speeds){
        super(name,speeds);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Vehicle obj1=new Bike("Splender",70);
        Vehicle obj2=new Car("Tesla",60);
        Vehicle[] obj={new Bike("Splender",70),new Car("Tesla",60)};
        for(Vehicle i:obj){
            i.move();
            i.display();
        }
        
    }}

