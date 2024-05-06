import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Carl", "John", "Anton", "Pearl"));

        String[] listOfNames = new String[names.size()];
        names.toArray(listOfNames);

        for(int i = 0; i < listOfNames.length; i++){
            System.out.print(listOfNames[i] + " ");
        }
    }
}
