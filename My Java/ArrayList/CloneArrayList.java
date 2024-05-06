import java.util.*;

public class CloneArrayList {

    @SuppressWarnings("unchecked")
    
    public static void main(String[] args) {
        ArrayList<String> humans = new ArrayList<String>();
        humans.add("Henry");
        humans.add("Alex");
        humans.add("Jeff");
        humans.add("Iris");
        System.out.println("Real Human Beings: " + humans);

        ArrayList<String> clonedHumans = (ArrayList<String>)humans.clone();

        System.out.println("Cloned Humans: " + clonedHumans);


    }

}
