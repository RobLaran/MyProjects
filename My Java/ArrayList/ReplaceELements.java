import java.util.ArrayList;

public class ReplaceELements {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>(5);
        words.add("Hi");
        words.add("Hello");
        words.add("Whoa");
        words.add("Hip");

        System.out.println("Elements: " + words);

        words.set(3, "Bro");

        System.out.println("New Elements: " + words);


    }

}
