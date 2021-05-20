package democomparator;

import democomparable.Student;

import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        StudentManager sm=new StudentManager();
        System.out.println("Sap xep theo ten: ");
        Collections.sort(sm.students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        sm.display();
        System.out.println("Sap xep theo tuoi: ");
        Collections.sort(sm.students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        sm.display();
    }
}
