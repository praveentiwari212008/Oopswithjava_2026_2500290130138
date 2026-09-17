  class InheritancePractice {
    public static void main(String[] args) {
        Developer obj =new Developer("c++","Praveen",5000);
        //obj.displayEmployee();
        obj.displayDeveloper();
       
    }
}
class Employee{
    private String name;
    private double salary;

     Employee(String name,double salary) {
            setName(name);
            setSalary(salary);

    }
    void  setName(String name){
        this.name=name;
    }
    // String getName(){
    //     return name;
    // }
     void  setSalary(double salary){
        this.salary=salary;
    }
    // double getSalary(){
    //     return salary;
    // }
    void displayEmployee(){
        System.out.println("Name: "+name);
          System.out.println("Salary: "+salary);
    }
    
}
class Developer extends Employee{
    private String ProgrammingLanguage;

    public Developer(String ProgrammingLanguage, String name, double salary) {
        super(name, salary);
        this.ProgrammingLanguage = ProgrammingLanguage;
    }
void displayDeveloper(){
         super.displayEmployee();
         System.out.println("ProgrammingLanguage: "+ProgrammingLanguage);
    }
    
    
}