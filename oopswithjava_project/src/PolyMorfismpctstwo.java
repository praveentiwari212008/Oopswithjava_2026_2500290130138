public class PolyMorfismpctstwo {
    public static void main(String[] args){
        Employee e1 = new Developer();
        Employee e2 = new Manager();
        e1.calculateSalary();
        e2.calculateSalary();
    }
}
class Employee{
    void calculateSalary(){
        System.err.println("Calculate Salary of Employee: ");
    }
}
class Developer extends Employee{
     @Override
    void calculateSalary(){
        System.err.println("Salary of Developer is 30k: ");
    }
}
class Manager extends Employee{
     @Override
    void calculateSalary(){
        System.err.println("Salary of  Manager is 50k: ");
    }
}