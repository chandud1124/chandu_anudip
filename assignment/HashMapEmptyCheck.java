import java.util.HashMap;
public class HashMapEmptyCheck {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println("Is the HashMap empty? : " + map.isEmpty());
        map.put(1, "Java");
        map.put(2, "Python");
        map.clear();
        System.out.println("Is the HashMap empty after clearing? : " + map.isEmpty());
    }