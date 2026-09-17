public class InheritancePracticeTwo {
    public static void main(String[] args){
        Car obj =new Car("Tata",850000,"Petrol");
        obj.displayCar();
    }
    
}
class Vehicle{
    private String brand;
    private double price;
    Vehicle(String brand,double price){
        this.brand=brand;
        this.price=price;
    }
    void displayVehicle(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
    }
}
class Car extends Vehicle{
    String fuelType;
    Car(String brand,double price,String fuelType){
        super(brand,price);
        this.fuelType=fuelType;
    }
    void displayCar(){
        super.displayVehicle();
        System.out.println("Fuel Type: "+fuelType);
    }
}