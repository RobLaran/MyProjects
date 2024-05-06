package OOP.Inventory;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("LED TV", 200);
        Product product2 = new Product("Smartphone", 80);
        Product product3 = new Product("Laptop", 50);

        System.out.println("Adding three products: ");
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        inventory.checkAllInventory();
        System.out.println();

        inventory.checkLowInventory();
        System.out.println();

        System.out.println("Removed " + product3.getName() + " from the inventory.");
        inventory.removeProduct(product3);

        System.out.println();

        inventory.checkLowInventory();
        System.out.println();
        inventory.checkAllInventory();
        

    }
}
