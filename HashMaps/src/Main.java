package HashMaps.src;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        final GradeBook gradeBook = new GradeBook(new HashMap<String, Student>());
        final ArrayList<Integer> grades = new ArrayList<>();
        grades.add(1);
        grades.add(2);
        grades.add(3);
        gradeBook.addStudent(new Student(1, "John", grades));
        gradeBook.addStudent(new Student(2, "Jack", grades));
        gradeBook.addStudent(new Student(3, "Eli", grades));
        gradeBook.addStudent(new Student(4, "George", grades));
        System.out.println(gradeBook);
        gradeBook.deleteStudent("1");
        System.out.println(gradeBook);
        System.out.println(gradeBook.findStudent("3"));
        gradeBook.clearStudents();
        System.out.println(gradeBook);
    }
}
