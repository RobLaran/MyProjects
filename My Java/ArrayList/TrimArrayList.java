import java.util.ArrayList;

public class TrimArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>(5);
        words.add("Hi");
        words.add("Hello");
        words.add("Whoa");
        words.add("Hip");

        System.out.println("Original array list:" + words + ", " + words.size() + " elements.");

        words.trimToSize();

        System.out.println("Let trim to size the above array:" + words + ", " + words.size() + " elements.");
        

    }

}
