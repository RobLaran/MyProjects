import java.util.ArrayList;

public class AddAllArrayLists {
    public static void main(String[] args) {
        ArrayList<String> tools = new ArrayList<String>();
        tools.add("Hammer");
        tools.add("Saw");
        tools.add("Wrench");
        System.out.println("Tools: " + tools);

        ArrayList<String> weapons = new ArrayList<String>();
        weapons.add("Axe");
        weapons.add("Baseball Bat");
        weapons.add("Military Knife");
        System.out.println("Weapons: " + weapons);

        ArrayList<String> melees = new ArrayList<String>();

        melees.addAll(tools);
        melees.addAll(weapons);

        System.out.println("All melees: " + melees);


    }

}
