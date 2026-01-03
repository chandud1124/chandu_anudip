import java.util.TreeMap;
import java.util.Scanner;

public class TreeMapSearch {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        // Adding name-age pairs
        map.put("Ravi", 25);
        map.put("Anita", 22);
        map.put("Kiran", 28);
        map.put("Suma", 24);

        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        if (map.containsKey(name)) {
            System.out.println("Age of " + name + " is: " + map.get(name));
        } else {
            System.out.println("Name not found.");
        }

        sc.close();
    }
}