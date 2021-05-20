package democomparable;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        StudentManager smana=new StudentManager();
        smana.display();
        System.out.println("Sap xep theo ten");
        Collections.sort(smana.students);
        smana.display();

    }
}
