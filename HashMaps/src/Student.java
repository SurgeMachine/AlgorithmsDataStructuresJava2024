package HashMaps.src;
import java.util.ArrayList;

public class Student {
    private final int id;
    private final String name;
    private final ArrayList<Integer> grades;
    Student(int id, String name, ArrayList<Integer> grades){
        this.id = id;
        this.name = name;
        this.grades = grades;
    }
    @Override
    public String toString(){
        return this.name + ", grades: " + this.grades;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }
}
