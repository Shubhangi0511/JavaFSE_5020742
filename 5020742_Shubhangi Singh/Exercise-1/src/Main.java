public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product(1, "Product A", 10, 9.99);
        Product product2 = new Product(2, "Product B", 20, 19.99);
        Product product3 = new Product(3, "Product C", 30, 29.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        System.out.println("All Products:");
        inventory.displayProducts();

        Product updatedProduct2 = new Product(2, "Product B Updated", 25, 24.99);
        inventory.updateProduct(2, updatedProduct2);

        System.out.println("\nAll Products after update:");
        inventory.displayProducts();

        inventory.deleteProduct(3);
        
        System.out.println("\nAll Products after deletion:");
        inventory.displayProducts();
    }
}