import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");

        System.out.println("Before removing the third element: " + colors);
        
        colors.remove(2);
        
        System.out.println("After removing the thirds element: " + colors);
    }

}
