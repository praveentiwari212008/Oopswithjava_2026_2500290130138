public class AbstractionPracticeone {
    public static void main(String[] args) {
        Shape a1 = new Circle();
        a1.area();
        Shape a2 = new Rectangle();
        a2.area();
    }
}
abstract class Shape{
    abstract void area();

    
}
class Circle extends Shape{
    @Override
    void area(){
        System.err.println("Area of circle is pi*r*r");
    }
}
class Rectangle extends Shape{
    @Override
    void area(){
        System.err.println("Area of Rectangle is length*width");
    }
}