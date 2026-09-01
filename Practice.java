class Student{
    String name;
    int age;
    float marks;
     public Student(String s,int a,float m){
        name=s;
        age=a;
        marks=m;}
        void display( ){
        System.out.println("Name: "+name);
         System.out.println("Age: "+age);
          System.out.println("Marks: "+marks);
    }
}



public class Practice {
    public static void main(String[] args) {
        Student obj1=new Student("Praveen",20,85.5f);
        obj1.display( );
    }
}

