import java.util.ArrayList;

public class RemoveAllElements {
    public static void main(String[] args) {
        ArrayList<String> computers = new ArrayList<String>();

        computers.add("Tablet");
        computers.add("Smartphone");
        computers.add("PC");
        computers.add("Laptop");

        System.out.println("Original Elements: " + computers);
        
        computers.removeAll(computers);
        
        System.out.println("Removed all elements: " + computers);

    }

}
