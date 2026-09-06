class Student{
    static String cname="KIET";
    String sname;
    int srollNo;
    private int age;
    public Student(String sname,int srollNo,int age){
        this.sname=sname;
        this.srollNo=srollNo;
        if(age>0 && age<100){
            this.age=age;
        }else{
            System.out.println("Invalid age");
        }

    }
    public void get_details(){
System.out.println("Student college: "+cname);
System.out.println("Student name: "+ sname);
System.out.println("Student rollNo: "+srollNo);
System.out.println("Student age: "+ age);
    }
}

public class Encapsulation {
    public static void main(String[] args){
        Student obj1=new Student("Praveen",126 ,-10 );
         Student obj2=new Student("Kunal",122 ,21 );
         obj1.get_details();
         obj2.get_details();

    }
}
