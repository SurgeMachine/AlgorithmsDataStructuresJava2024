package HashMaps.src;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        final GradeBook gradeBook = new GradeBook();
        final ArrayList<Integer> grades = new ArrayList<>();
        grades.add(1);
        grades.add(2);
        grades.add(3);
        final ArrayList<Integer> grades1 = new ArrayList<>();
        grades1.add(1);
        grades1.add(2);
        grades1.add(3);
        gradeBook.addStudent(new Student(1, "John", grades));
        gradeBook.addStudent(new Student(2, "Jack", grades1));
        gradeBook.addStudent(new Student(3, "Eli", grades));
        gradeBook.addStudent(new Student(4, "George", grades));
        System.out.println(gradeBook);
        gradeBook.deleteStudent("1");
        System.out.println(gradeBook);
        System.out.println(gradeBook.findStudent("3"));
        gradeBook.addGrade("2", 12);
        System.out.println(gradeBook);
        gradeBook.clearStudents();
        System.out.println(gradeBook);
    }
}
