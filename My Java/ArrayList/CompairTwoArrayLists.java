import java.util.ArrayList;

public class CompairTwoArrayLists {
    public static void main(String[] args) {
        ArrayList<String> colors1 = new ArrayList<String>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Blue");
        colors1.add("Yellow");

        ArrayList<String> colors2 = new ArrayList<String>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Yellow");

        ArrayList<String> tempColor = new ArrayList<String>();

        for(String element: colors1){
            tempColor.add(colors2.contains(element) ? "Yes" : "No");
        }
        
        System.out.println(tempColor);

    }

}
