  import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int rollno;
    int marks;

    Student(String s, int r, int m){
        name = s;
        rollno = r;
        marks = m;

    }
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return this.rollno -o.rollno;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return rollno + " " + name + " " + marks;
    }
}
class CustomComparator implements Comparator<Student>{
    @Override 
    public int compare(Student o1,Student o2){
        if(o1.marks!=o2.marks){
            return o2.marks-o1.marks;
        }
        return o1.rollno-o2.rollno;
    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Integer> i  = new ArrayList<>();
        i.add(23);
        i.add(26);
        i.add(29);
        i.add(24);
        i.add(28);
        i.sort(null);

        System.out.println(i);
        i.sort(Collections.reverseOrder());
        System.out.println(i);

        ArrayList<Student> st = new ArrayList<>();

        st.add(new Student("rahul", 1, 100));
        st.add(new Student("ramesh", 10, 200));
        st.add(new Student("pawan", 7, 50));
        st.add(new Student("praveen", 5, 70));
        st.add(new Student("prabhat", 4, 80));

        st.sort(null);
        System.out.println(st);
        st.sort(new CustomComparator());//comparator
        System.out.println(st);
    }
}