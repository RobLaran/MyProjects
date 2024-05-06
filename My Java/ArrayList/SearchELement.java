import java.util.ArrayList;

public class SearchELement {
    public static void main(String[] args) {
        
        ArrayList<String> animals = new ArrayList<String>();
        
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Parrot");
        animals.add("Pig");

        if(animals.contains("Parrot")){
            System.out.println("Found element");
        } else {
            System.out.println("Not Found");
        }


    }
}
