package HashMaps;

import java.util.HashMap;

public class Add_KeyValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Bruno", 32);
        map.put("Patrick", 28);
        map.put("Sal", 54);
        map.put("Vince", 26);

        System.out.println("HashMap: " + map);

        for(String i : map.keySet()){
            System.out.println("Name: " + i + ", Age: " + map.get(i));
        }

    }
}
