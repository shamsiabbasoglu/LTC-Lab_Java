package lesson22.Main.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Johan", 24, 88);
        Student student2 = new Student("Patrick", 22, 66);
        Student student3 = new Student("Alex", 23, 77);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        students.sort(new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getGrade(), o2.getGrade());
            }
        });

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
