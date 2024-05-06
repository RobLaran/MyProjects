package OOP.Inventory;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Product> products;

    public Inventory(){
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void checkLowInventory(){
        System.out.println("Check Low Inventory: ");
        for(Product product: products){
            if(product.getQuantity() <= 100){
                System.out.println(product.getName() + " is running low on inventory. Current quantity: " + product.getQuantity());
            }
        }
    }

    public void checkAllInventory(){
        System.out.println("All Products in Inventory: ");
        for(Product product: products){
            System.out.println("Name of the Product: " + product.getName() + ", Quantity of the Product: " + product.getQuantity());
        }
    }

}
