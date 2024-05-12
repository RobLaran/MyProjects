package HashMaps;

import java.util.HashMap;

public class Check_KeyValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Bruno", 32);
        map.put("Patrick", 28);
        map.put("Sal", 54);
        map.put("Vince", 26);

        System.out.println("Original HashMap: " + map);

        System.out.println("Check if Name Bruno is in the Mappings: " + map.containsKey("Bruno"));
        System.out.println("Check if Age 54 is in the Mappings: " + map.containsValue(54));
        System.out.println("Check if Name Jack is in the Mappings: " + map.containsKey("Jack"));

        
        
    }
}
