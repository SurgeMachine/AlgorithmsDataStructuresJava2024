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
    final HashMap<String, Student> GradeBook;
    GradeBook(HashMap<String, Student> GradeBook){
        this.GradeBook = GradeBook;
    }
    public void addStudent(Student student){
        this.GradeBook.put(student.id + "", student);
    }
    public void deleteStudent(String ID){
        this.GradeBook.remove(ID);
    }
    public Student findStudent(String ID){
        return this.GradeBook.get(ID);
    }
    @Override
    public String toString(){
        return this.GradeBook.toString();
    }
    public void clearStudents(){
        this.GradeBook.clear();
    }
}
