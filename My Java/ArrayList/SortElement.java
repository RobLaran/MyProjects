import java.util.ArrayList;
import java.util.Collections;

public class SortElement {
    public static void main(String[] args) {
        ArrayList<String> computers = new ArrayList<String>();

        computers.add("Tablet");
        computers.add("Smartphone");
        computers.add("PC");
        computers.add("Laptop");

        System.out.println(computers);

        Collections.sort(computers);

        System.out.println(computers);

    }

}
