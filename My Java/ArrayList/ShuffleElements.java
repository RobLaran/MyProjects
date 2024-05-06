import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElements {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");

        System.out.println("Before shuffling: " + colors);

        Collections.shuffle(colors);

        System.out.println("After shuffling: " + colors);
    }
}
