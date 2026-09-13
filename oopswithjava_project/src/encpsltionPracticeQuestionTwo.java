public class encpsltionPracticeQuestionTwo {
    public static void main(String[] args){
        Student obj =new Student("Praveen", 15, 92);
            obj.getDetails();
    }
    
}
class Student{
    private String name;
private int age;
private double marks;
    Student(String name,int  age,double marks){
        this.name=name;
        if(age>=18){
        this.age=age;}
        else{
            System.out.println("Invalid age: ");
        }
        if(marks<=100){
        this.marks=marks;}
        else{
               System.out.println("Invalid marks: ");
        }
    }
    void getDetails(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Marks: "+marks);
    }

}