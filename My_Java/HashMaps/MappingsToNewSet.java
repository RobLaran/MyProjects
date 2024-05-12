package HashMaps;

import java.util.HashMap;
import java.util.Set;

public class MappingsToNewSet {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Bruno", 32);
        map.put("Patrick", 28);
        map.put("Sal", 54);
        map.put("Vince", 26);

        System.out.println("Original HashMap: " + map);

        Set set = map.entrySet();

        System.out.println("New Set of Mappings: " + set);

    }
}
