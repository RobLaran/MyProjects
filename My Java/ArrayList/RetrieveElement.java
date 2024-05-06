import java.util.ArrayList;

public class RetrieveElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>(); 

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Yellow");

        System.out.println(colors);

        System.out.println("Retrieving: " + colors.get(2) + " at Index 2");
        System.out.println("Retrieving: " + colors.get(4) + " at Index 4");
    }
}
