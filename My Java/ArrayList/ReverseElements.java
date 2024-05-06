import java.util.ArrayList;
import java.util.Collections;

public class ReverseElements {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");

        System.out.println("Before reversing: " + colors);

        Collections.reverse(colors);

        System.out.println("After reversing: " + colors);
    }

}
