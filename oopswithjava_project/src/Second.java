class Employee{
    int id;
    String name;
    int salary;
    public Employee(int id,String name,int s){
        this.id=id;
        this.name=name;
        salary=s;
    }
    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}



public class Second {
    public static void main(String[]  args){
        Employee obj1=new Employee(101, "Praveen", 50000);
        obj1.display();
    }
}
