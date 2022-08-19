import java.util.*;

public class Hashing {

    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        map.put("China", 180);
        // System.out.println(map.remove("India"));
        System.out.println(map);

    }

}
