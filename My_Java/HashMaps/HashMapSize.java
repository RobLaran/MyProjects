package HashMaps;

import java.util.HashMap;

public class HashMapSize {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Bruno", 32);
        map.put("Patrick", 28);
        map.put("Sal", 54);
        map.put("Vince", 26);

        System.out.println("HashMap Size/Length: " + map.size());

    }
}
