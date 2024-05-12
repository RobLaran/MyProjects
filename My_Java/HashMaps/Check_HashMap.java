package HashMaps;

import java.util.HashMap;

public class Check_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map.put("Bruno", 32);
        map.put("Patrick", 28);
        map.put("Sal", 54);
        map.put("Vince", 26);

        System.out.println("Original HashMap: " + map);
        System.out.println("Second HashMap: " + map2);

        String check = (map.isEmpty()) ? "It is Empty" : "It is not Empty";        
        String check2 = (map2.isEmpty()) ? "It is Empty" : "It is not Empty";        

        System.out.println("Check First HashMap is empty: " + check);
        System.out.println("Check Second HashMap is empty: " + check2);


    }
}
