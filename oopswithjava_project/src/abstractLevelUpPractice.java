public class abstractLevelUpPractice {
    public static void main(String[] args){
        Employee e1= new FullTimeEmployee("Praveen",50000);
        Employee e2= new PartTimeEmployee("Kunal",20,500);
        System.out.println("Name: "+ e1.getName());
        e1.calculatSalary();
          System.out.println("Name:" +e2.getName());
        e2.calculatSalary();
    }
}
abstract class Employee{
    private String name;
    abstract void calculatSalary();
    Employee(String n){
        name=n;
    }
    String getName(){
        return name;
    }
}
class FullTimeEmployee extends Employee{
     private double monthlySalary;
    FullTimeEmployee(String name,double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    }
    void calculatSalary(){
     System.out.println("Monthly Salary: "+ monthlySalary);}

}
class  PartTimeEmployee extends Employee{

    private int hours;
    private double hourlyRate;

 PartTimeEmployee(String name,int hours, double hourlyRate){
        super(name);
         this.hours = hours;
        this.hourlyRate = hourlyRate;
    }
    void calculatSalary(){
     double salary = hours * hourlyRate;

        System.out.println("Hours: " + hours);
        System.out.println("Hourly Rate: ₹" + hourlyRate);
        System.out.println("Total Salary: ₹" + salary);}
}