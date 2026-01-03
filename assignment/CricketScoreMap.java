import java.util.HashMap;
import java.util.Map;
public class CricketScoreMap {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Rohit Sharma", 89);
        scores.put("Virat Kohli", 112);
        scores.put("KL Rahul", 76);
        String batsman = "Rohit Sharma";
        if (scores.containsKey(batsman)) {
            System.out.println(batsman + "'s score: " + scores.get(batsman));
        } else {
            System.out.println("Batsman not found");
        }
    }
}