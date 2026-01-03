import java.util.HashSet;
public class HashSetAppend {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("banana");
        fruits.add("date");
        fruits.add("apple");
        fruits.add("cherry");
        System.out.println("Updated HashSet: " + fruits);
    }
}