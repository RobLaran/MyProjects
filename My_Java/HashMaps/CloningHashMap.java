package HashMaps;

import java.util.HashMap;

public class CloningHashMap {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Bruno", 32);
        map.put("Patrick", 28);
        map.put("Sal", 54);
        map.put("Vince", 26);

        System.out.println("Original HashMap: " + map);
        
        HashMap<String, Integer> clone = new HashMap<>();

        clone = (HashMap<String, Integer>)map.clone();

        System.out.println("Clone HashMap: " + clone);
    }
}
