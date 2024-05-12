package HashMaps;

import java.util.HashMap;
import java.util.Set;

public class SetOfKeys {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Bruno", 32);
        map.put("Patrick", 28);
        map.put("Sal", 54);
        map.put("Vince", 26);

        System.out.println("Original HashMap: " + map);

        Set<String> set = map.keySet();

        System.out.println("A view of keys(Names): " + set);

    }
}
