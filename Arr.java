import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Arr {
    /**
     * 0. Write a Java class with main method consist of:
     * 1. create a new array list, add some colors (string) and print out the collection
     * 2. iterate through all elements in a array list
     * 3. insert an element into the array list at the first position
     * 4. retrieve an element (at a specified index) from a given array list
     * 5. update specific array element by given element
     * 6. remove the third element from a array list
     * 7. search an element in a array list
     * 8. sort a given array list
     * 9. copy one array list into another
     * 10. reverse elements in a array list
     * 11. compare two array lists
     * 12. empty an array list
     * 13. test an array list is empty or not
     * 14. increase the size of an array list
     * 15. trim the capacity of an array list the current list size
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Purple");
        list.add("Green");
        list.add("Blue");
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
        list.add(0,"Yellow");
        System.out.println(list.get(0));
        list.set(0, "Orange");
        list.remove(2);
        System.out.println(list);
        System.out.println(list.contains("Orange"));
        list.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(list);
        ArrayList<String> list1 = (ArrayList<String>)list.clone();
        System.out.println(list1);
        System.out.println(list1.reversed());
        System.out.println(list.equals(list1));
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
        list1.ensureCapacity(13);
        list1.trimToSize();
    }
}