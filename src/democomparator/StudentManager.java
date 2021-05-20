package democomparator;

import democomparable.Student;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentManager {
    ArrayList<democomparable.Student> students=null;

    public StudentManager() {
        students=new ArrayList<>();
        students.add(new democomparable.Student("Tu",20));
        students.add(new democomparable.Student("Thanh",26));
        students.add(new democomparable.Student("Oanh",18));
        students.add(new democomparable.Student("Nam",30));
        students.add(new democomparable.Student("Hai",19));
        students.add(new democomparable.Student("Uyen",18));

    }

    public StudentManager(ArrayList<democomparable.Student> students) {
        this.students = students;
    }

    void display(){
        for (Student s:students) {
            System.out.println(s.toString());
        }
    }


}
