package Exercise1;

import java.util.HashMap;

public class Exercise1 {
    private HashMap<String, Product> inventory;

    public Exercise1() {
        this.inventory = new HashMap<>();
    }

    public void addProduct(String productId, String productName, int quantity, double price) {
        Product product = new Product(productId, productName, quantity, price);
        inventory.put(productId, product);
    }

    public void updateProduct(String productId, String productName, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product product = new Product(productId, productName, quantity, price);
            inventory.put(productId, product);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    @Override
    public String toString() {
        return "InventoryManagementSystem{" +
                "inventory=" + inventory +
                '}';
    }

    // Main method for testing
    public static void main(String[] args) {
    	Exercise1 ims = new Exercise1();

        ims.addProduct("001", "Laptop", 10, 999.99);
        ims.addProduct("002", "Smartphone", 50, 499.99);

        System.out.println("Initial Inventory:");
        System.out.println(ims);

        // Update a product
        ims.updateProduct("001", "Laptop", 8, 979.99);

        System.out.println("Inventory after updating Laptop:");
        System.out.println(ims);

        // Delete a product
        ims.deleteProduct("002");

        System.out.println("Inventory after deleting Smartphone:");
        System.out.println(ims);
    }
}
