public class useCAse2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
 
        for (Shape s : shapes) {
            s.displayArea();   // must print correct area for each shape
        }
    }
    
}
abstract  class Shape{
    abstract double area();
    void displayArea(){
        System.err.println("Area = " + area());
    }
}
class Circle extends Shape{
    double radius;

    public Circle(double r) {
        this.radius=r;
    }
    double area(){
        return 22/7.0*radius*radius;
    }
    
}
class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(double l,double w){
        this.length=l;
        this.width=w;
    }
    double area(){
        return length*width;
    }

}
