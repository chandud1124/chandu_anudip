import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringList {
    public static void main(String[] args) {

        // Create list of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");

        // Print original list
        System.out.println("Original list: " + fruits);

        // Reverse the list
        Collections.reverse(fruits);

        // Print reversed list
        System.out.println("Reversed list: " + fruits);
    }
}