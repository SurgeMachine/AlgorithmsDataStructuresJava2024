package HashMaps.src;
import java.util.ArrayList;

public class Student {
    final int id;
    final String name;
    final ArrayList<Integer> grades;
    Student(int id, String name, ArrayList<Integer> grades){
        this.id = id;
        this.name = name;
        this.grades = grades;
    }
    @Override
    public String toString(){
        return this.name + ", grades: " + this.grades;
    }
}
