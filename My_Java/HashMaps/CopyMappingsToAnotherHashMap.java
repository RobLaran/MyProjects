package HashMaps;

import java.util.HashMap;

public class CopyMappingsToAnotherHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Bruno", 32);
        map.put("Patrick", 28);
        map.put("Sal", 54);
        map.put("Vince", 26);

        System.out.println("Original HashMap: " + map);

        HashMap<String, Integer> map2 = new HashMap<>();

        map2.put("John", 20);
        map2.put("Rob", 22);

        map2.putAll(map);

        System.out.println("New HashMap: " + map2);

    }
}
