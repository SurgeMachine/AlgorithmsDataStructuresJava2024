package HashMaps.src;

import java.util.HashMap;

public class GradeBook {

    /*Створіть програму для управління оцінками студентів. Кожен студент має
    унікальний ідентифікаційний номер (ID), ім’я та список оцінок.
    Використовуйте HashMap для зберігання інформації про студентів.
    Створіть клас Student з полями ID, name та grades.
    Створіть клас GradeBook, який містить HashMap<String, Student> для зберігання студентів.
    Реалізуйте методи для додавання, видалення та пошуку студентів за ID.
    Реалізуйте метод для виведення всіх студентів та їх оцінок.*/
    final HashMap<String, Student> gradeBook;
    GradeBook(){
        this.gradeBook = new HashMap<>();
    }
    public void addStudent(Student student){
        this.gradeBook.put(student.getId() + "", student);
    }
    public void deleteStudent(String ID){
        this.gradeBook.remove(ID);
    }
    public Student findStudent(String ID){return this.gradeBook.get(ID);}
    public void addGrade(String ID, int grade) {
        if(this.gradeBook.get(ID) != null){
            Student student = this.gradeBook.get(ID);
            student.getGrades().add(grade);
        }
    }
    @Override
    public String toString(){
        return this.gradeBook.toString();
    }
    public void clearStudents(){
        this.gradeBook.clear();
    }
}
