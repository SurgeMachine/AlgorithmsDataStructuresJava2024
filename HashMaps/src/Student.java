import java.util.ArrayList;

public class Student {
    int id;
    String name;
    ArrayList<Integer> grades = new ArrayList<>();
    Student(int id, String name, ArrayList<Integer> grades){
        this.id = id;
        this.name = name;
        this.grades = grades;
    }
    public String toString(){
        return this.name + ", grades: " + this.grades;
    }
}
