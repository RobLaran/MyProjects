package HashMaps;

import java.util.HashMap;

public class GetValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Bruno", 32);
        map.put("Patrick", 28);
        map.put("Sal", 54);
        map.put("Vince", 26);

        System.out.println("Original HashMap: " + map);

        System.out.println("Get Value(Age) of Sal: " + map.get("Sal"));
    }
}
