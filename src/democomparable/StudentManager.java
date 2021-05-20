package democomparable;

import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students=null;

    public StudentManager() {
        students=new ArrayList<>();
        students.add(new Student("Tu",20));
        students.add(new Student("Thanh",26));
        students.add(new Student("Oanh",18));
        students.add(new Student("Nam",30));
        students.add(new Student("Thanh",19));
        students.add(new Student("Uyen",18));

    }

    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    void display(){
        for (Student s:students) {
            System.out.println(s.toString());
        }
    }
}
