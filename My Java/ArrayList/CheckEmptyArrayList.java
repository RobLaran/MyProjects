import java.util.ArrayList;

public class CheckEmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> box = new ArrayList<String>();
        box.add("Nails");
        box.add("Duct Tape");
        box.add("Ruler");
        box.add("Trophy");

        System.out.println("Original Elements: " + box + ", Check if it is empty: " + box.isEmpty());

        box.removeAll(box);

        System.out.println("Removed all elements: " + box + ", Check if it is empty: " + box.isEmpty());


    }

}
