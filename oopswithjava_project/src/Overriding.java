public class Overriding {
    public static void main(String[ ] args){
        Shape obj =new  Circle(20.0);
        obj.area();
        Shape obj1=new Reactangle(7,8);
       obj1.area();
    }
    
}
class Shape{
    void area(){}
}
class Circle extends Shape{
    private double r;
    Circle(double r){
        this.r=r;
    }
    void area(){
        System.err.println("Area of circle: "+(22/7.0*r*r));
    }
}
class Reactangle extends Shape{
    private int l,b;

     Reactangle(int l,int b) {
        this.l=l;
        this.b=b;
    }
    void area(){
        System.err.println("Area of Reactangle is "+(l*b));
    }
     

}